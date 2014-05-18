package models;

import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.start;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.*;

public class TestModelTest {

  @Before
  public void setUp() {
    start(fakeApplication(inMemoryDatabase()));
  }
  
  @Test
  public void 初期値は空リスト() {
    assertThat(TestModel.all()).isEmpty();
  }
  
  @Test
  public void addしたものが順番に取り出せる() {
    TestModel ts0 = new TestModel();
    ts0.name = "ほとココア";
    ts0.value = 15;
    TestModel.create(ts0);
    
    TestModel ts1 = new TestModel();
    ts1.name = "かふうチノ";
    ts1.value = 13;
    TestModel.create(ts1);
    
    TestModel ts2 = new TestModel();
    ts2.name = "てでざリゼ";
    ts2.value = 16;
    TestModel.create(ts2);
    
    TestModel ts3 = new TestModel();
    ts3.name = "うじまつチヤ";
    ts3.value = 15;
    TestModel.create(ts3);
    
    TestModel ts4 = new TestModel();
    ts4.name = "きりまシャロ";
    ts4.value = 15;
    TestModel.create(ts4);
    
    assertThat(TestModel.all()).hasSize(5);
    assertThat(TestModel.all().get(0).name).isEqualTo("ほとココア");
  }

}
