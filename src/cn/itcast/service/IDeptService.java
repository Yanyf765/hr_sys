package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.Dept;

public interface IDeptService {
	List<Dept> getAll();
	Dept findById(int id);
}
