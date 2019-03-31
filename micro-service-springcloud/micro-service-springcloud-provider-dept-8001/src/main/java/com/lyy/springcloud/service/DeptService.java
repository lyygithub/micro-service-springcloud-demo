package com.lyy.springcloud.service;

import java.util.List;

import com.lyy.springcloud.entities.Dept;
public interface DeptService
{
  public boolean add(Dept dept);
  public Dept    get(Long id);
  public List<Dept> list();
}

