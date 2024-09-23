import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.apache.zookeeper.CreateMode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

/**
 * @ClassName CuratorTest
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/19 - 18:10
 */
public class CuratorTest {

    private CuratorFramework client;

    @Before
    public void connectTest() {
        client = CuratorFrameworkFactory.builder()
                .connectString("localhost:2182")
                .sessionTimeoutMs(60 * 1000)
                .connectionTimeoutMs(15 * 1000)
                .retryPolicy(new RetryNTimes(3, 3000))
                .namespace("codingshen")
                .build();

        client.start();
    }

    @After
    public void close() {
        if (client != null) {
            client.close();
        }
    }

    /**
     * 1. 基本创建
     * 2. 创建节点 带有数据
     * 3. 设置节点的类型
     * 4. 创建多级节点 /app1/p1
     */
    @Test
    public void testCreate() throws Exception {
        // 2. 创建节点 带有数据
        String path = client.create().forPath("/app2", "test".getBytes(StandardCharsets.UTF_8));
        System.out.println("path = " + path);
    }


    /**
     * 1. 查询数据: get -> getData().forPath()
     * 2. 查询子节点: ls -> getChildren().forPath()
     * 3. 查询子节点状态信息: ls -s -> getChildren().storingStatIn(状态对象).forPath()
     */
    @Test
    public void testGet() throws Exception {
        byte[] bytes = client.getData().forPath("/app1");
        System.out.println("bytes = " + new String(bytes));
    }

}
