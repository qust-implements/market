package edu.qust.market.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;

public class SHA1Util {
    public static String encodePassword(String psw) {
        if(StringUtils.isEmpty(psw)){
            return null;
        }else{
            return DigestUtils.sha1Hex(psw);
        }
    }

}
