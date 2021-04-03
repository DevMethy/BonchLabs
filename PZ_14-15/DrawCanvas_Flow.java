import java.awt.*;
import java.awt.event.*;
public class DrawCanvas extends Canvas {
    private int lastX, lastY;
    private int ex, ey;
    private boolean clear=false;

    public DrawCanvas () {
        super();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                ex=e.getX();
                ey=e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }
    public static void main(String s[]) {

        final Frame f = new Frame("Flaw");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(1920, 1080);

        final Canvas c = new DrawCanvas();
        f.add(c);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(new Label("Test"));
        f.add(new Button("Long string"));
        f.add(new TextArea(2, 20));
        f.add(new Button("short"));
        f.add(new TextArea(4, 20));
        f.add(new Label("Long-long text"));
        f.setVisible(true);

    }
}