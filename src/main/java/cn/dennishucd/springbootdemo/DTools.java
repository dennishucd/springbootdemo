package cn.dennishucd.springbootdemo;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DTools {

	public static String Object2JsonStr(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String json = "";

		try {
			json = mapper.writeValueAsString(object);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return json;
	}

	public static <T> String List2JSONStr(List<T> list) {
		ObjectMapper mapper = new ObjectMapper();
		StringWriter sw = new StringWriter();

		try {
			mapper.writeValue(sw, list);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sw.toString();
	}

	public static <T> T JSONStr2Object(String jsonStr, Class<T> beanCalss) {
		ObjectMapper mapper = new ObjectMapper();
		T bean = null;
		try {
			bean = (T) mapper.readValue(jsonStr, beanCalss);
		} catch (JsonParseException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return bean;

	}
}
