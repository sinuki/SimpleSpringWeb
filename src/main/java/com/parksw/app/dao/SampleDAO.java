package com.parksw.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.parksw.app.vo.SampleVO;

@Repository
public interface SampleDAO {

	List<SampleVO> getSamples();
}
