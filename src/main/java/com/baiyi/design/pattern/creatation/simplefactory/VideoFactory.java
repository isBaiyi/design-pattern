package com.baiyi.design.pattern.creatation.simplefactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/25 14:47
 */
public class VideoFactory {
    public Video getVideo(String typeName) {
        if ("java".equalsIgnoreCase(typeName)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(typeName)) {
            return new PythonVideo();
        }
        return null;
    }

    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
