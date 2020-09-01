package com.example.motoBlog.interfaces;

import lombok.Data;

@Data
public interface Powertrain {
    String engine = "";
    int displacement = 0;
    int engineTorque = 0;
}
