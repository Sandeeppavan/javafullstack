import java.awt.Color;

Color c1 = Color.RED;
Color c2 = Color.BLUE;

// Create a new color by averaging the RGB values of c1 and c2
Color c3 = new Color((c1.getRed() + c2.getRed()) / 2,
                     (c1.getGreen() + c2.getGreen()) / 2,
                     (c1.getBlue() + c2.getBlue()) / 2);

// Create a brighter version of c1
float[] hsb = Color.RGBtoHSB(c1.getRed(), c1.getGreen(), c1.getBlue(), null);
float hue = hsb[0];
float saturation = hsb[1];
float brightness = hsb[2];

brightness = Math.min(brightness * 1.5f, 1.0f);

Color brighterColor = Color.getHSBColor(hue, saturation, brightness);
