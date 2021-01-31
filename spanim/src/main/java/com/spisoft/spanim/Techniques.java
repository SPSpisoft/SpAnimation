
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.spisoft.spanim;

import com.spisoft.spanim.attention.BounceAnimator;
import com.spisoft.spanim.attention.FlashAnimator;
import com.spisoft.spanim.attention.PulseAnimator;
import com.spisoft.spanim.attention.RubberBandAnimator;
import com.spisoft.spanim.attention.ShakeAnimator;
import com.spisoft.spanim.attention.StandUpAnimator;
import com.spisoft.spanim.attention.SwingAnimator;
import com.spisoft.spanim.attention.TadaAnimator;
import com.spisoft.spanim.attention.WaveAnimator;
import com.spisoft.spanim.attention.WobbleAnimator;
import com.spisoft.spanim.bouncing_entrances.BounceInAnimator;
import com.spisoft.spanim.bouncing_entrances.BounceInDownAnimator;
import com.spisoft.spanim.bouncing_entrances.BounceInLeftAnimator;
import com.spisoft.spanim.bouncing_entrances.BounceInRightAnimator;
import com.spisoft.spanim.bouncing_entrances.BounceInUpAnimator;
import com.spisoft.spanim.fading_entrances.FadeInAnimator;
import com.spisoft.spanim.fading_entrances.FadeInDownAnimator;
import com.spisoft.spanim.fading_entrances.FadeInLeftAnimator;
import com.spisoft.spanim.fading_entrances.FadeInRightAnimator;
import com.spisoft.spanim.fading_entrances.FadeInUpAnimator;
import com.spisoft.spanim.fading_exits.FadeOutAnimator;
import com.spisoft.spanim.fading_exits.FadeOutDownAnimator;
import com.spisoft.spanim.fading_exits.FadeOutLeftAnimator;
import com.spisoft.spanim.fading_exits.FadeOutRightAnimator;
import com.spisoft.spanim.fading_exits.FadeOutUpAnimator;
import com.spisoft.spanim.flippers.FlipInXAnimator;
import com.spisoft.spanim.flippers.FlipInYAnimator;
import com.spisoft.spanim.flippers.FlipOutXAnimator;
import com.spisoft.spanim.flippers.FlipOutYAnimator;
import com.spisoft.spanim.rotating_entrances.RotateInAnimator;
import com.spisoft.spanim.rotating_entrances.RotateInDownLeftAnimator;
import com.spisoft.spanim.rotating_entrances.RotateInDownRightAnimator;
import com.spisoft.spanim.rotating_entrances.RotateInUnAnimator;
import com.spisoft.spanim.rotating_entrances.RotateInUpLeftAnimator;
import com.spisoft.spanim.rotating_entrances.RotateInUpRightAnimator;
import com.spisoft.spanim.rotating_exits.RotateOutAnimator;
import com.spisoft.spanim.rotating_exits.RotateOutDownLeftAnimator;
import com.spisoft.spanim.rotating_exits.RotateOutDownRightAnimator;
import com.spisoft.spanim.rotating_exits.RotateOutUpLeftAnimator;
import com.spisoft.spanim.rotating_exits.RotateOutUpRightAnimator;
import com.spisoft.spanim.sliders.SlideInDownAnimator;
import com.spisoft.spanim.sliders.SlideInLeftAnimator;
import com.spisoft.spanim.sliders.SlideInRightAnimator;
import com.spisoft.spanim.sliders.SlideInUpAnimator;
import com.spisoft.spanim.sliders.SlideOutDownAnimator;
import com.spisoft.spanim.sliders.SlideOutLeftAnimator;
import com.spisoft.spanim.sliders.SlideOutRightAnimator;
import com.spisoft.spanim.sliders.SlideOutUpAnimator;
import com.spisoft.spanim.specials.HingeAnimator;
import com.spisoft.spanim.specials.RollInAnimator;
import com.spisoft.spanim.specials.RollOutAnimator;
import com.spisoft.spanim.specials.in.DropOutAnimator;
import com.spisoft.spanim.specials.in.LandingAnimator;
import com.spisoft.spanim.specials.out.TakingOffAnimator;
import com.spisoft.spanim.zooming_entrances.ZoomInAnimator;
import com.spisoft.spanim.zooming_entrances.ZoomInDownAnimator;
import com.spisoft.spanim.zooming_entrances.ZoomInLeftAnimator;
import com.spisoft.spanim.zooming_entrances.ZoomInRightAnimator;
import com.spisoft.spanim.zooming_entrances.ZoomInUpAnimator;
import com.spisoft.spanim.zooming_exits.ZoomOutAnimator;
import com.spisoft.spanim.zooming_exits.ZoomOutDownAnimator;
import com.spisoft.spanim.zooming_exits.ZoomOutLeftAnimator;
import com.spisoft.spanim.zooming_exits.ZoomOutRightAnimator;
import com.spisoft.spanim.zooming_exits.ZoomOutUpAnimator;

public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInUn(RotateInUnAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);



    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
