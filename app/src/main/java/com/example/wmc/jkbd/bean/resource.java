package com.example.wmc.jkbd.bean;

import java.util.List;

/**
 * Created by wmc on 2017/6/29.
 */

public class resource {

    /**
     * error_code : 0
     * reason : ok
     * result : [{"id":29,"question":"这个标志是何含义？","answer":"1","item1":"禁止通行","item2":"减速行驶","item3":"限时进入","item4":"禁止驶入","explains":"禁止通行：表示禁止一切车辆和行人通行。此标志设在禁止通行的道路入口处。","url":"http://images.juheapi.com/jztk/c1c2subject1/29.jpg"}]
     */

    /**
     * error_code : 0
     * reason : ok
     * result : [{"id":3,"question":"这个标志是何含义？","answer":"1","item1":"车道数变少","item2":"合流处","item3":"应急车道","item4":"向左变道","explains":"三车道变成二车道故车道数变少，选A。","url":"http://images.juheapi.com/jztk/c1c2subject1/3.jpg"}]
     */

    private int error_code;
    private String reason;

    private List<Question> result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Question> getResult() {
        return result;
    }

    public void setResult(List<Question> result) {
        this.result = result;
    }
}