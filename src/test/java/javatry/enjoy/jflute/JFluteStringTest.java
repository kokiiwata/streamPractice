package javatry.enjoy.jflute;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        String blue = "blue";
        List<ColorBox> blueBoxList = colorBoxList
                .stream()
                .filter(colorBox -> colorBox.getColor().toString().equals(blue))
                .collect(Collectors.toList());
        log(blueBoxList);
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
     * カラーボックスに入ってる文字列の中で、一番長いものと短いものの差は何文字？
     */
    public void test_length_findMaxMinDiff() {
    }

    /**
     * カラーボックスに入ってる値 (文字列以外のものはtoString()) の中で、二番目に長い文字列は？ <br>
     * ソートして二番目を取得する、ってやり方で。
     */
    public void test_length_findSecondMax_bySort() {
    }

    /**
     * カラーボックスに入ってる値 (文字列以外のものはtoString()) の中で、二番目に長い文字列は？ <br>
     * ただし、ソートして二番目を取得する、ってやり方は利用しないこと。
     */
    public void test_length_findSecondMax_nonSorted() {
    }

    /**
     * カラーボックスに入ってる文字列の長さの合計は？
     */
    public void test_length_calculateLengthSum() {
        List<ColorBox> colorBoxList = getColorBoxList();
        colorBoxList.forEach(colorBox -> {
            colorBox.getColor().getColorName();
        });
        List<Object> contentsList = colorBoxList
                .stream()
                .flatMap(colorBox -> colorBox.getSpaceList().stream())
                .map(space -> space.getContents())
                .collect(Collectors.toList());


//        Integer sumCount = 0;
//        for (String string : stringNames) {
//            sumCount += string.length();
//        }
//        log(sumCount);
    }

    // ===================================================================================
    //                                                            startsWith(), endsWith()
    //                                                            ========================
    /**
     * 「かまくら」で始まる文字列をしまっているカラーボックスの色は？
     */
    public void test_startsWith_findFirstWord() {
    }

    /**
     * 「いぬ」で終わる文字列をしまっているカラーボックスの色は？
     */
    public void test_endsWith_findLastWord() {
    }

    // ===================================================================================
    //                                                            indexOf(), lastIndexOf()
    //                                                            ========================
    /**
     * あなたのカラーボックスに入ってる「いぬ」で終わる文字列で、「いぬ」は何文字目から始まる？
     */
    public void test_indexOf_findIndex() {
    }

    /**
     * あなたのカラーボックスに入ってる「ず」を二つ以上含む文字列で、最後の「ず」は何文字目から始まる？
     */
    public void test_lastIndexOf_findIndex() {
    }

    // ===================================================================================
    //                                                                         substring()
    //                                                                         ===========
    /**
     * カラーボックスに入ってる「いぬ」で終わる文字列の最初の一文字は？
     */
    public void test_substring_findFirstChar() {
    }

    /**
     * カラーボックスに入ってる「かまくら」で始まる文字列の最後の一文字は？
     */
    public void test_substring_findLastChar() {
    }

    // ===================================================================================
    //                                                                           replace()
    //                                                                           =========
    /**
     * カラーボックスに入ってる「ー」を含んだ文字列から「ー」を全て除去したら何文字？
     */
    public void test_replace_removeBo() {
    }

    // ===================================================================================
    //                                                                           Good Luck
    //                                                                           =========
    /**
     * カラーボックスの中で、色の名前が一番長いものは？
     */
    public void test_findMaxColorSize() throws Exception {
    }

    /**
     * カラーボックスの中で、2012/06/04 を示す日付が持っている秒は？
     */
    public void test_findDBFluteBirthdateSecond() throws Exception {
    }

    /**
     * カラーボックスの中に入っている Map を "map:{ key = value ; key = value ; ... }" という形式で表示。
     */
    public void test_showMap() throws Exception {
    }

    /**
     * "map:{ key1 = value1 ; key2 = value2 ; key3 = value3 }" という文字列をMapに変換してtoString()すると？
     * <pre>
     * 変換後のMapの中身は、以下のようになっていること
     *  o key1というキーに対してvalue1という値
     *  o key2というキーに対してvalue2という値
     *  o key3というキーに対してvalue3という値
     * </pre>
     */
    public void test_parseMap() throws Exception {
    }

    /**
     * "map:{ key1 = value1 ; key2 = map:{ nkey21 = nvalue21 ; nkey22 = nvalue22 } ; key3 = value3 }" <br />
     * という文字列をMapに変換してtoString()すると？ <br />
     * <br />
     * "map:{ key1 = value1 ; key2 = value2 ; key3 = map:{ nkey31 = nvalue31 ; nkey32 = nvalue32 } }" <br />
     * でも、同じプログラムでMapに変換できるようにするべし。
     */
    public void test_parseMap_deep() throws Exception {
    }
}
