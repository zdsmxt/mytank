package com.zds.tank4;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

//定义资源管理类 管理这些图片
public class ResourceMgr {
    //坦克图片
    public static BufferedImage tankL,tankU,tankR,tankD;
    //子弹图片
    public static BufferedImage bulletL,bulletU,bulletR,bulletD;
    //加载子弹或者坦克爆炸之后的效果图
    public static BufferedImage explodes[] = new BufferedImage[16];
    //通过一个静态代码块来加载这些图片
    static{

        try {
            //加载资源类的时候加载这些图片
            tankL = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankL.gif"));
            tankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankU.gif"));
            tankR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankR.gif"));
            tankD = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankD.gif"));
            //加载子弹
            bulletL = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletL.gif"));
            bulletU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletU.gif"));
            bulletR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletR.gif"));
            bulletD = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
            //用for循环遍历加载16张爆炸效果图到内存中  画出爆炸的效果图
            for (int i = 0; i < explodes.length; i++) {
               explodes[i]=ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/e"+(i+1)+".gif"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

}
