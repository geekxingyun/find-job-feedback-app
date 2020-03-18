package com.xingyun.findjobfeedbackapp.customize;

import com.xingyun.findjobfeedbackapp.util.AesUtils;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SafeDataSource extends HikariDataSource {

    @Override
    public void setPassword(String password) {
        String originPassword= null;
        try {
            originPassword = AesUtils.decrypt(password);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        super.setPassword(originPassword);
    }
}
