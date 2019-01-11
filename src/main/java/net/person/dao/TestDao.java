package net.person.dao;

/**
 * Created by admin on 2018/1/31.
 */
import java.util.List;
import net.person.model.TestModel;

public interface TestDao {
    //获取test表所有数据
    public List<TestModel> getAllTest();
}