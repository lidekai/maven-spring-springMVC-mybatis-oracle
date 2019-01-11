package net.person.controller;

import net.person.model.TestModel;
import net.person.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 测试springMVC映射
 * Created by admin on 2018/1/31.
 */
@Controller
@RequestMapping("/home")
public class TestController {
    //添加一个日志器
    public TestService testServiceImpl;
    @Autowired
    public void setTestService(TestService testServiceImpl) {
        this.testServiceImpl = testServiceImpl;
    }

    //映射一个action
    @RequestMapping("/index")
    public String editItemsQuery(Model model) throws Exception{
        List<TestModel> itemsList = testServiceImpl.getAllTest();
        System.out.println(itemsList.size());
        return "test";
    }
}
