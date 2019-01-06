/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class SpringLayoutSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);
        
        JLabel label=new JLabel("label");
        //layout the label to (5, 5)
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.EAST, label, 5, SpringLayout.EAST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, frame.getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, label, 5, SpringLayout.SOUTH, frame.getContentPane());
        ////////////////////////////
        
        frame.add(label);
        frame.setVisible(true);
    }

}

//springLayout.putConstraint(SpringLayout.WEST,jbt,spring,SpringLayout.WEST,jPanel);//1、单独用时，从左向右移动了一点。。。
//springLayout.putConstraint(SpringLayout.EAST,jbt,spring,SpringLayout.EAST,jPanel);//2、单独用时，去到右边了。。。部分消失了。。。
//springLayout.putConstraint(SpringLayout.WEST,jPanel,spring,SpringLayout.WEST,jbt);//3、单独用时，无作用。。。
//springLayout.putConstraint(SpringLayout.EAST,jPanel,spring,SpringLayout.EAST,jbt);//4、单独用时，无作用。。。
//只使用ok按钮时，1、4一起用时，ok按钮居中。
//而2、3一起用时，或3、4一起用时，或2、4一起用时，或1、2一起用时，或1、3一起用时，无此效果。




/**
//可以与1、4一起用，两个按钮会重叠。
springLayout.putConstraint(SpringLayout.WEST,jbt6,spring,SpringLayout.WEST,jPanel);//单独用时，从左向右移动了一点。。。
springLayout.putConstraint(SpringLayout.EAST,jPanel,spring,SpringLayout.EAST,jbt6);//单独用时，无作用。。。
*/

/*
//证明一条边可以连接多个弹簧，但是任意两条边之间只能放置一个弹簧（放置多个则取最后放置者来产生显示效果）。
springLayout.putConstraint(SpringLayout.WEST,jbt7,spring,SpringLayout.WEST,jPanel);//
springLayout.putConstraint(SpringLayout.WEST,jbt8,spring,SpringLayout.WEST,jbt7);//
springLayout.putConstraint(SpringLayout.WEST,jbt9,spring,SpringLayout.WEST,jbt7);//
springLayout.putConstraint(SpringLayout.EAST,jPanel,spring,SpringLayout.WEST,jbt8);//
springLayout.putConstraint(SpringLayout.EAST,jPanel,spring,SpringLayout.WEST,jbt9);//
*/




// springLayout.putConstraint(SpringLayout.SOUTH,jPanel,spring,SpringLayout.SOUTH,jbt);//5、单独用时，无作用。。。
// springLayout.putConstraint(SpringLayout.NORTH,jPanel,spring,SpringLayout.NORTH,jbt);//6、单独用时，无作用。。。
// springLayout.putConstraint(SpringLayout.SOUTH,jbt,spring,SpringLayout.SOUTH,jPanel);//7、单独用时，去到下面了。。。部分消失了。。。
//springLayout.putConstraint(SpringLayout.NORTH,jbt,spring,SpringLayout.NORTH,jPanel);// 8、单独用时，从上向下移动了一点。。。

//只使用ok按钮时，5、8一起用时，ok按钮居中。
//而6、7一起用时，或7、8一起用时，或6、8一起用时，或5、6一起用时，或5、7一起用时，无此效果。
/**
    //下列二句一起用时，右边的弹簧力量比左边的强一倍。     
     springLayout.putConstraint(SpringLayout.WEST,jbt,spring,SpringLayout.WEST,jPanel);//单独用时，从左向右移动了一点。。。
     springLayout.putConstraint(SpringLayout.EAST,jPanel,Spring.sum(spring, spring),SpringLayout.EAST,jbt);//单独用时，无作用。。。
*/