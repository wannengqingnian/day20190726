package com.czxy.score.service.impl;

import com.czxy.score.dao.MettingMapper;
import com.czxy.score.domain.Metting;
import com.czxy.score.service.MettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MettingServiceImpl implements MettingService {
    @Autowired
    private MettingMapper mettingMapper;
    @Override
    public Metting findByUsername(String username) {
      return   mettingMapper.findByUsername(username);
    }
}
