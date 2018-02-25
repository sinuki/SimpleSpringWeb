package com.parksw.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parksw.app.dao.SampleDAO;
import com.parksw.app.vo.SampleVO;

@Service
public class SampleService {

	@Autowired
	private SampleDAO sampleDao;
	
	public List<SampleVO> getSamples() {
		return sampleDao.getSamples();
	}
}
