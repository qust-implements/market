package edu.qust.market.service;

import edu.qust.market.bean.Banner;
import edu.qust.market.bean.BannerExample;
import edu.qust.market.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    public List<Banner> getBanner(){
        BannerExample bannerExample = new BannerExample();
        return bannerMapper.selectByExample(bannerExample);
    }
}
