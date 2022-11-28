Applet – Add 2 numbers, Display the result
import java.awt.*;
import java.applet.*;
public class UserIn extends Applet
{
TextField text1, text2;
public void init()
{
text1=new TextField(8);
text2=new TextField(8);
add(text1);
add(text2);
text1.setText(&quot;0&quot;);
text2.setText(&quot;0&quot;);
}
public void paint(Graphics g)

{
int x=0,y=0, z=0;

String s1,s2,s;
g.drawString(&quot;Input a number in each box: &quot;, 10,50);
try
{
s1=text1.getText();
x=Integer.parseInt(s1);
s2=text2.getText();
y=Integer.parseInt(s2);
}
catch (Exception e)
{
}
z=x+y;
s=String.valueOf(z);
g.drawString(&quot;The Sum is: &quot;, 10,75);
g.drawString(s,100,75);
}//End of paint method
public boolean action(Event event, Object object)

{
repaint();
return true;
}

}//End of class UserIn

&lt;html&gt;
&lt;applet code=UserIn.class width=300 height=300&gt;
&lt;/applet&gt;
&lt;/html&gt;
Output Screen: Next Page