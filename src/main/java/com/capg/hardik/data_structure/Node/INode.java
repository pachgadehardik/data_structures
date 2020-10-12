package com.capg.hardik.data_structure.Node;

public interface INode<T>{

	public T getKey();
	public INode<T> getNext();
	public void setKey(T key);
	public void setNext(INode<T> next);
	
}
