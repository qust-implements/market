package edu.qust.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean timestamp(long t){
        return System.currentTimeMillis() / 1000 - t < 1000 * 60 *10;
    }
}
