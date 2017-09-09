package cn.itcast.dao;

import java.util.List;

public interface IBaseDao<T> {
	void save(T emp);
	void delete(int id);
	void update(T emp);
	
	T findById(int id);
	List<T> getAll();
}
