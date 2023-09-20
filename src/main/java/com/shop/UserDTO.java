package com.shop;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
    private String name;
    private Integer age;

    public UserDTO(){

    }

    public String toString(){
        String var10000 = this.getName();
        return "UserDTO(name="+var10000+", age" + this.getAge()+")";
    }




}
