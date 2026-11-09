package com.YuHao.jobtracker.repository;


import com.YuHao.jobtracker.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{
}
