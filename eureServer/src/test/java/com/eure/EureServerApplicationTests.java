package com.eure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EureServerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testParamType() {
		Map<String, String> map = new HashMap<>();

		Map.Entry<String, String> map2 = null;
		map.put("0", "root");
		map.put("0", "root");
	}

	@Test
	public void testReference() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		// 通过jsonObject构建json对象
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("data", list);
		System.err.println("json:" + jsonObject);

		// 通過newreference()json对象数据转化为string数组

		List<String> stringList = jsonObject
				.getObject("data", new TypeReference<List<Integer>>() {
				});

		System.err.println("测试输出字符串！" + stringList);

	}

}
