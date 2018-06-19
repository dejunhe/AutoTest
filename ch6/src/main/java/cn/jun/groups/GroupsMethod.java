package cn.jun.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * 组测试
 */
public class GroupsMethod {
    @Test(groups = "server")
    public void Test1() {
        System.out.println("这是服务端组的测试方法1111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组的测试方法22222");
    }

    @Test(groups = "client")
    public void Test3() {
        System.out.println("这是客户端组的测试方法333333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组的测试方法444444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {
        System.out.println("这是服务端运行之前的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {
        System.out.println("这是服务器运行结束之后的方法!!!!");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("这是客户端运行之前的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("这是客户端运行结束之后的方法!!!!");
    }
}
