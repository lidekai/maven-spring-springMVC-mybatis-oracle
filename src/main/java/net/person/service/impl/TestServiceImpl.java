package net.person.service.impl;

import net.person.dao.TestDao;
import net.person.model.TestModel;
import net.person.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by admin on 2018/1/31.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {

    public TestDao testDao;
    @Autowired
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
    public List<TestModel> getAllTest() {
        return testDao.getAllTest();
    }
}