package com.mystic.RCKM.Chroma;

import org.jglr.jchroma.JChroma;
import org.jglr.jchroma.effects.CustomKeyboardEffect;
import org.jglr.jchroma.utils.ColorRef;

public class Chroma {
    public static void init() {
        JChroma chroma = JChroma.getInstance();
        chroma.init();
        CustomKeyboardEffect customKeyboardEffect = new CustomKeyboardEffect();
        customKeyboardEffect.setColor(4, 3, new ColorRef(255,0,0)); //the Z key is red!
        chroma.createKeyboardEffect(customKeyboardEffect);
    }
}
