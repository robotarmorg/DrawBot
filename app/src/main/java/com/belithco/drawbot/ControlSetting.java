package com.belithco.drawbot;

/**
 * Filters have values which control how the image is rendered
 */
public class ControlSetting {
    String name;
    enum valueType {
        string,
        number,
    }
    String value;
}
