package com.mobiusinversion.web.application.utils;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by david on 3/11/15
 */
public class JsonUtils {

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String objectToJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object jsonToObject(String json) {
        try {
            return mapper.readValue(json, Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JsonNode jsonToJsonNode(String json) {
        try {
            return mapper.readTree(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T jsonToObject(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T jsonToObject(String json, TypeReference<T> tTypeReference) {
        try {
            return mapper.readValue(json, tTypeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static HashMap<String,String> jsonToStringHashMap(String json) {
        TypeReference<HashMap<String,String>> typeRef = new TypeReference<HashMap<String,String>>() {};
        try {
            return mapper.readValue(json, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
