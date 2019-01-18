package com.atguigu.crud.utils;

import java.util.List;
import java.util.ArrayList;

public enum Color {

	RED("赤", 100), GREEN("緑", 200), BLANK("黒", 300), YELLO("黄色", 400);

	private String name;
	private int index;

	List<String> li = new ArrayList<String>();

	Color(String name, int index) {
		this.name = name;
		this.index = index;
	}
}
