package DataStructur;

/**
 * @author GYJ
 * 泛型定义JSON格式，整个系统中需要统一数据的传输格式
 */
public class JsonResult<T> {
    private T data;
    /**
     * code 表示状态码  可以使用枚举类*/
    private String code;

    /**msg 表示该状态的信息解释
     * */
    private String msg;

    /**
     * 若没有数据返回，默认状态码为0，提示信息为：操作成功！
     */
    public JsonResult() {
        this.code = "0";
        this.msg = "success！";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code 状态码
     * @param msg 消息
     */
    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为0，默认提示信息为：操作成功！
     * @param data 数据
     */
    public JsonResult(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "success";
    }

    /**
     * 有数据返回，状态码为0，人为指定提示信息
     * @param data 数据
     * @param msg 消息
     */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
