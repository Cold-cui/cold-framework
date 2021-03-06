package com.cold.framework.api.bean.in;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * Parameters required for sign in.
 *
 * @author cuipeng
 * @date 2019/1/18 14:57
 */
public class SignInVo extends BaseInVo {

    @NotBlank
    @Length(min = 11, max = 11)
    private String phoneNumber;

    @NotBlank
    @Length(min = 6, max = 6)
    private String smsCode;

    @NotBlank
    @Length(min = 1, max = 128)
    private String deviceId;

    @Length(max = 50)
    private String token;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
