package br.com.itau.responses;

import java.util.ArrayList;
import java.util.List;

public class Response<T>{

private List<String> errors;

private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getErrors() {
        if (this.errors == null) {
            this.errors = new ArrayList<String>();
        }
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Response() {
    }



}
