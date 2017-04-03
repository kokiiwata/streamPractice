package javatry.enjoy.jflute;

import java.util.List;

import javatry.colorbox.ColorBox;
import javatry.colorbox.color.BoxColor;
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

    }

    /**
     * ②カラーボックスをforEachで回して、それぞれの色をログに出しましょう！
     */
    public void test_forEachColor() {

    }

    /**
     * ③for文で、色だけのリストを作りましょう！
     */
    public void test_createColorListByFor() {

    }

    /**
     * ④.map()と、
     * collect.Collections.toList()を使って色のリストを作りましょう！
     */
    public void test_createColorListByStream() {

    }

    /**
     * ⑤緑色(green)のカラーボックスだけログに出しましょう！
     */
    public void test_greenBox() {

    }
    /**
     * ⑥filterとcollectを使って、青色だけのリストを作りましょう！
     */
    public void test_filterBlue() {

    }

    /**
     * ⑦カラーボックスのコンテンツを取り出して、リストを作りましょう！
     * ※ foreachではなく、flatMapを使うこと
     */
    public void test_stringList() {

    }

    /**
     * ⑧青カラーボックスのコンテンツのリストを作りましょう！
     */
    public void test_blueContentsList() {

    }

    /**
     * おまけ①)　カラーボックスに入ってるObjectの長さ(length)の合計は？
     */
    public void test_length_calculateLengthSum() {

    }
}
