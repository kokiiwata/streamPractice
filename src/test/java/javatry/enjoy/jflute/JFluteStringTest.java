package javatry.enjoy.jflute;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javatry.colorbox.ColorBox;
import javatry.colorbox.color.BoxColor;
import javatry.colorbox.space.BoxSpace;
import javatry.colorbox.unit.ColorBoxTestCase;

/**
 * 文字列のテスト。<br>
 * 何々は？と言われたら、それに該当するものをログに出力すること。
 * @author jflute
 */
public class JFluteStringTest extends ColorBoxTestCase {

    /**
     * 0 Sample
     * 最初のカラーボックスの色の名前の文字数は？
     */
    public void test_length_basic() {
        List<ColorBox> colorBoxList = getColorBoxList();
        ColorBox colorBox = colorBoxList.get(0);
        BoxColor boxColor = colorBox.getColor();
        String colorName = boxColor.getColorName();
        log(colorName, colorName.length());
    }

    /**
     * ①カラーボックスをfor文で回して、それぞれの色をログに出しましょう！
     */
    public void test_forColor() {
        List<ColorBox> colorBoxList = getColorBoxList();
        for (ColorBox box : colorBoxList) {
            log(box.getColor());
        }
    }

    /**
     * ②カラーボックスをforEachで回して、それぞれの色をログに出しましょう！
     */
    public void test_forEachColor() {
        List<ColorBox> colorBoxList = getColorBoxList();
        colorBoxList.forEach(colorBox -> {
            log(colorBox.getColor());
        });
    }

    /**
     * ③for文で、色だけのリストを作りましょう！
     */
    public void test_createColorListByFor() {
        List<ColorBox> colorBoxList = getColorBoxList();
        List<String> colorList = new ArrayList<>();
        for (ColorBox colorBox : colorBoxList) {
            String color = colorBox.getColor().toString();
            colorList.add(color);
        }
        log(colorList);
    }

    /**
     * ④.map()と、
     * collect.Collections.toList()を使って色のリストを作りましょう！
     */
    public void test_createColorListByStream() {
        List<ColorBox> colorBoxList = getColorBoxList();
        List<BoxColor> colorList = colorBoxList.stream()
                .map(colorBox -> colorBox.getColor())
                .collect(Collectors.toList());
        log(colorList);
    }

    /**
     * ⑤緑色(green)のカラーボックスだけログに出しましょう！
     */
    public void test_greenBox() {
        List<ColorBox> colorBoxList = getColorBoxList();
        for (ColorBox box : colorBoxList) {
            String color = box.getColor().toString();
            if (color.equals("green")) {
                log(color);
            } else {
                log("緑ではありません。");
            }
        }
    }
    /**
     * ⑥filterとcollectを使って、青色だけのリストを作りましょう！
     */
    public void test_filterBlue() {
        List<ColorBox> colorBoxList = getColorBoxList();
        final String blue = "blue";
        List<ColorBox> blueBoxList = colorBoxList
                .stream()
                .filter(colorBox -> blue.equals(colorBox.getColor().toString()))
                .collect(Collectors.toList());
        log(blueBoxList);
    }

    /**
     * ⑦カラーボックスのコンテンツを取り出して、リストを作りましょう！
     * ※ foreachではなく、flatMapを使うこと
     */
    public void test_stringList() {
        List<ColorBox> colorBoxList = getColorBoxList();
        List<Object> コンテンツリスト = colorBoxList
                .stream()
                .flatMap(colorBox -> colorBox.getSpaceList().stream())
                .map(space -> space.getContents())
                .collect(Collectors.toList());
        log(コンテンツリスト);
    }

    /**
     * ⑧青カラーボックスのコンテンツのリストを作りましょう！
     */
    public void test_blueContentsList() {
        List<ColorBox> colorBoxList = getColorBoxList();
        List<Object> blueContentsList = colorBoxList.stream()
                .filter(colorBox -> colorBox.getColor().toString().equals("yellow"))
                .flatMap(colorBox -> colorBox.getSpaceList().stream())
                .map(BoxSpace::getContents)
                .collect(Collectors.toList());
        log(blueContentsList);
    }

    /**
     * カラーボックスに入ってる文字列の中で、一番長い文字列は？
     */
    public void test_length_findMax() {
        List<ColorBox> colorBoxList = getColorBoxList();
        colorBoxList.forEach(colorBox -> {
            colorBox.getColor().getColorName();
        });
        List<String> stringNames = colorBoxList
                .stream()
                .map(colorBox -> colorBox.getColor())
                .map(boxColor -> boxColor.getColorName())
                .collect(Collectors.toList());
        String preString = null;
    }

    /**
     * おまけ①)　カラーボックスに入ってるObjectの長さ(length)の合計は？
     */
    public void test_length_calculateLengthSum() {
        List<ColorBox> colorBoxList = getColorBoxList();
        colorBoxList.forEach(colorBox -> {
            colorBox.getColor().getColorName();
        });
        int sum = colorBoxList
                .stream()
                .flatMap(colorBox -> colorBox.getSpaceList().stream())
                .filter(boxSpace -> boxSpace.getContents() != null)
                .mapToInt(boxSpace -> boxSpace.getContents().toString().length())
                .sum();
        log(sum);
    }
}
