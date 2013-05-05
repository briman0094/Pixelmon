// Date: 4/11/2013 6:41:36 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.quadruped.SkeletonQuadruped;

public class ModelBastiodon extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer body_1;
    PixelmonModelRenderer body_2;
    PixelmonModelRenderer back_spike_1;
    PixelmonModelRenderer back_spike_2;
    PixelmonModelRenderer back_spike_3;
    PixelmonModelRenderer back_spike_4;
    PixelmonModelRenderer back_spike_5;
    PixelmonModelRenderer back_spike_6;
    PixelmonModelRenderer tail_1;
    PixelmonModelRenderer tail_2;
    PixelmonModelRenderer tail_3;
    PixelmonModelRenderer tail_4;
    PixelmonModelRenderer head_main;
    PixelmonModelRenderer shield_main;
    PixelmonModelRenderer shield_top_L;
    PixelmonModelRenderer shield_top_L_2;
    PixelmonModelRenderer shield_top_R_2;
    PixelmonModelRenderer shield_top_R;
    PixelmonModelRenderer shield_top_2_L;
    PixelmonModelRenderer shield_top_2_R;
    PixelmonModelRenderer shield_top_2_middle;
    PixelmonModelRenderer jaw;
    PixelmonModelRenderer shield_nose;
    PixelmonModelRenderer shield_nose_bottom_L;
    PixelmonModelRenderer shield_nose_bottom_R;
    PixelmonModelRenderer shield_nose_bottom_middle;
    PixelmonModelRenderer shield_nosetop;
    PixelmonModelRenderer shield_nosetop2;
    PixelmonModelRenderer shield_nose_top_L;
    PixelmonModelRenderer shield_nose_top_R;
    PixelmonModelRenderer shield_nose_spike_1_L;
    PixelmonModelRenderer shield_nose_spike_2_L;
    PixelmonModelRenderer shield_nose_spike_1_R;
    PixelmonModelRenderer shield_nose_spike_2_R;
    PixelmonModelRenderer shield_bottom_spike__2_R;
    PixelmonModelRenderer shield_bottom_spike__3_L;
    PixelmonModelRenderer shield_bottom_spike__1_R;
    PixelmonModelRenderer shield_bottom_spike__1_L;
    PixelmonModelRenderer tooth_1_L;
    PixelmonModelRenderer tooth_1_R;
    PixelmonModelRenderer tooth_2_R;
    PixelmonModelRenderer tooth_2_L;
    PixelmonModelRenderer shield_top_spike_1_L;
    PixelmonModelRenderer shield_top_spike_1_R;
    PixelmonModelRenderer shield_top_spike_2_L;
    PixelmonModelRenderer shield_top_spike_2_R;
    PixelmonModelRenderer head_top;
    PixelmonModelRenderer front_leg_1_L;
    PixelmonModelRenderer front_leg_2_L;
    PixelmonModelRenderer front_leg_2_L_2;
    PixelmonModelRenderer front_leg_2_L_3;
    PixelmonModelRenderer front_leg_2_L_4;
    PixelmonModelRenderer front_toes_1_L;
    PixelmonModelRenderer front_toes_2_L;
    PixelmonModelRenderer front_leg_1_R;
    PixelmonModelRenderer front_leg_2_R;
    PixelmonModelRenderer front_leg_2_R_2;
    PixelmonModelRenderer front_leg_2_R_3;
    PixelmonModelRenderer front_leg_2_R_4;
    PixelmonModelRenderer front_toes_1_R;
    PixelmonModelRenderer front_toes_2_R;
    PixelmonModelRenderer back_leg_1_R;
    PixelmonModelRenderer back_leg_2_R;
    PixelmonModelRenderer back_leg_2_R_2;
    PixelmonModelRenderer back_leg_2_R_3;
    PixelmonModelRenderer back_leg_2_R_4;
    PixelmonModelRenderer back_toes_1_R;
    PixelmonModelRenderer back_toes_2_R;
    PixelmonModelRenderer back_leg_1_L;
    PixelmonModelRenderer back_leg_2_L;
    PixelmonModelRenderer back_leg_2_L_2;
    PixelmonModelRenderer back_leg_2_L_3;
    PixelmonModelRenderer back_leg_2_L_4;
    PixelmonModelRenderer back_toes_1_L;
    PixelmonModelRenderer back_toes_2_L;
    PixelmonModelRenderer Body;
  
  public ModelBastiodon()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, 11, 0);
      PixelmonModelRenderer  body_1 = new PixelmonModelRenderer(this, 0, 44);
      body_1.addBox(-6F, 0F, -3F, 12, 9, 11);
      body_1.setTextureSize(128, 64);
      body_1.mirror = true;
      setRotation(body_1, -0.0349066F, 0F, 0F);
      PixelmonModelRenderer  body_2 = new PixelmonModelRenderer(this, 0, 24);
      body_2.addBox(-6.5F, -0.4F, -8F, 13, 10, 9);
      body_2.setTextureSize(128, 64);
      body_2.mirror = true;
      setRotation(body_2, 0.0523599F, 0F, 0F);
      PixelmonModelRenderer  back_spike_1 = new PixelmonModelRenderer(this, 33, 0);
      back_spike_1.addBox(-1F, -5.4F, -6F, 2, 2, 2);
      back_spike_1.setTextureSize(128, 64);
      back_spike_1.mirror = true;
      setRotation(back_spike_1, 0.7679449F, 0F, 0F);
      PixelmonModelRenderer  back_spike_2 = new PixelmonModelRenderer(this, 33, 0);
      back_spike_2.addBox(-1F, -4F, -4F, 2, 2, 2);
      back_spike_2.setTextureSize(128, 64);
      back_spike_2.mirror = true;
      setRotation(back_spike_2, 0.7679449F, 0F, 0F);
      PixelmonModelRenderer  back_spike_3 = new PixelmonModelRenderer(this, 33, 0);
      back_spike_3.addBox(-1F, -2.466667F, -2.533333F, 2, 3, 3);
      back_spike_3.setTextureSize(128, 64);
      back_spike_3.mirror = true;
      setRotation(back_spike_3, 0.7679449F, 0F, 0F);
      PixelmonModelRenderer  back_spike_4 = new PixelmonModelRenderer(this, 33, 0);
      back_spike_4.addBox(-1F, -0.4666667F, -0.5333334F, 2, 3, 3);
      back_spike_4.setTextureSize(128, 64);
      back_spike_4.mirror = true;
      setRotation(back_spike_4, 0.6108652F, 0F, 0F);
      PixelmonModelRenderer  back_spike_5 = new PixelmonModelRenderer(this, 33, 0);
      back_spike_5.addBox(-1F, 1.533333F, 1.466667F, 2, 3, 3);
      back_spike_5.setTextureSize(128, 64);
      back_spike_5.mirror = true;
      setRotation(back_spike_5, 0.6108652F, 0F, 0F);
      PixelmonModelRenderer  back_spike_6 = new PixelmonModelRenderer(this, 33, 0);
      back_spike_6.addBox(-1F, 3.333333F, 3.733333F, 2, 2, 2);
      back_spike_6.setTextureSize(128, 64);
      back_spike_6.mirror = true;
      setRotation(back_spike_6, 0.6806784F, 0F, 0F);
      
      
      PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
      Tail.setRotationPoint(0, 4, 8);
      PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 102, 51);
      tail_1.addBox(-3.5F, -3F, -3F, 7, 7, 6);
      tail_1.setTextureSize(128, 64);
      tail_1.mirror = true;
      setRotation(tail_1, -0.1396263F, 0F, 0F);
      PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 110, 41);
      tail_2.addBox(-2.5F, -3F, -1.533333F, 5, 5, 4);
      tail_2.setRotationPoint(0F, 1F, 3F);
      tail_2.setTextureSize(128, 64);
      tail_2.mirror = true;
      setRotation(tail_2, -0.0872665F, 0F, 0F);
      PixelmonModelRenderer tail_3 = new PixelmonModelRenderer(this, 107, 57);
      tail_3.addBox(-1.5F, -1.6F, -1.066667F, 3, 3, 3);
      tail_3.setRotationPoint(0F, 0.53333F, 5.46667F);
      tail_3.setTextureSize(128, 64);
      tail_3.mirror = true;
      setRotation(tail_3, -0.0349066F, 0F, 0F);
      PixelmonModelRenderer tail_4 = new PixelmonModelRenderer(this, 112, 57);
      tail_4.addBox(-0.5F, -1.266667F, -1.066667F, 1, 2, 2);
      tail_4.setRotationPoint(0F, 0.4F, 7.46667F);
      tail_4.setTextureSize(128, 64);
      tail_4.mirror = true;
      setRotation(tail_4, 0.0523599F, 0F, 0F);
      
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0, 4, -7);
      PixelmonModelRenderer head_main = new PixelmonModelRenderer(this, 66, 31);
      head_main.addBox(-4.5F, -2.4F, -5.8F, 9, 6, 6);
      head_main.setTextureSize(128, 64);
      head_main.mirror = true;
      setRotation(head_main, 0.0523599F, 0F, 0F);
      PixelmonModelRenderer shield_main = new PixelmonModelRenderer(this, 94, 0);
      shield_main.addBox(-6.5F, -11.4F, -6.533333F, 13, 14, 4);
      shield_main.setTextureSize(128, 64);
      shield_main.mirror = true;
      setRotation(shield_main, 0.0523599F, 0F, 0F);
      PixelmonModelRenderer shield_top_L = new PixelmonModelRenderer(this, 77, 0);
      shield_top_L.addBox(0.5F, -14.6F, -6.533333F, 4, 4, 4);
      shield_top_L.setTextureSize(128, 64);
      shield_top_L.mirror = true;
      setRotation(shield_top_L, 0.0523599F, 0F, 0.2094395F);
      PixelmonModelRenderer shield_top_L_2 = new PixelmonModelRenderer(this, 79, 2);
      shield_top_L_2.addBox(0.5F, -15.6F, -3.5F, 4, 4, 2);
      shield_top_L_2.setTextureSize(128, 64);
      shield_top_L_2.mirror = true;
      setRotation(shield_top_L_2, 0.3316126F, 0F, 0.2094395F);
      PixelmonModelRenderer shield_top_R_2 = new PixelmonModelRenderer(this, 79, 2);
      shield_top_R_2.addBox(-4.5F, -15.6F, -3.5F, 4, 4, 2);
      shield_top_R_2.setTextureSize(128, 64);
      shield_top_R_2.mirror = true;
      setRotation(shield_top_R_2, 0.3316126F, 0F, -0.2094395F);
      PixelmonModelRenderer shield_top_R = new PixelmonModelRenderer(this, 77, 0);
      shield_top_R.addBox(-4.5F, -14.6F, -6.533333F, 4, 4, 4);
      shield_top_R.setTextureSize(128, 64);
      shield_top_R.mirror = true;
      setRotation(shield_top_R, 0.0523599F, 0F, -0.2094395F);
      PixelmonModelRenderer shield_top_2_L = new PixelmonModelRenderer(this, 78, 1);
      shield_top_2_L.addBox(-6.5F, -11.6F, -6.533333F, 4, 4, 3);
      shield_top_2_L.setTextureSize(128, 64);
      shield_top_2_L.mirror = true;
      setRotation(shield_top_2_L, 0F, 0F, 0.715585F);
      PixelmonModelRenderer shield_top_2_R = new PixelmonModelRenderer(this, 78, 1);
      shield_top_2_R.addBox(2.5F, -11.6F, -6.533333F, 4, 4, 3);
      shield_top_2_R.setTextureSize(128, 64);
      shield_top_2_R.mirror = true;
      setRotation(shield_top_2_R, 0F, 0F, -0.715585F);
      PixelmonModelRenderer shield_top_2_middle = new PixelmonModelRenderer(this, 78, 1);
      shield_top_2_middle.addBox(4.5F, -9.6F, -6.533333F, 4, 4, 3);
      shield_top_2_middle.setTextureSize(128, 64);
      shield_top_2_middle.mirror = true;
      setRotation(shield_top_2_middle, 0F, 0F, -0.715585F);
      PixelmonModelRenderer jaw = new PixelmonModelRenderer(this, 83, 19);
      jaw.addBox(-7F, 1.066667F, -5.066667F, 14, 6, 5);
      jaw.setTextureSize(128, 64);
      jaw.mirror = true;
      setRotation(jaw, -0.3665191F, 0F, 0F);
      PixelmonModelRenderer shield_nose = new PixelmonModelRenderer(this, 97, 22);
      shield_nose.addBox(-2.5F, -0.4F, -7.9F, 5, 4, 4);
      shield_nose.setTextureSize(128, 64);
      shield_nose.mirror = true;
      setRotation(shield_nose, -0.1570796F, 0F, 0F);
      PixelmonModelRenderer shield_nose_bottom_L = new PixelmonModelRenderer(this, 100, 23);
      shield_nose_bottom_L.addBox(1F, 1.2F, -8.2F, 2, 2, 4);
      shield_nose_bottom_L.setTextureSize(128, 64);
      shield_nose_bottom_L.mirror = true;
      setRotation(shield_nose_bottom_L, -0.0349066F, 0F, 0.4363323F);
      PixelmonModelRenderer shield_nose_bottom_R = new PixelmonModelRenderer(this, 100, 24);
      shield_nose_bottom_R.addBox(-3F, 1.2F, -8.2F, 2, 2, 4);
      shield_nose_bottom_R.setTextureSize(128, 64);
      shield_nose_bottom_R.mirror = true;
      setRotation(shield_nose_bottom_R, -0.0349066F, 0F, -0.4363323F);
      PixelmonModelRenderer shield_nose_bottom_middle = new PixelmonModelRenderer(this, 87, 23);
      shield_nose_bottom_middle.addBox(-1.5F, 2.2F, -8.2F, 3, 2, 4);
      shield_nose_bottom_middle.setTextureSize(128, 64);
      shield_nose_bottom_middle.mirror = true;
      setRotation(shield_nose_bottom_middle, -0.0349066F, 0F, 0F);
      PixelmonModelRenderer shield_nosetop = new PixelmonModelRenderer(this, 99, 40);
      shield_nosetop.addBox(-1.5F, -1.4F, -9.1F, 3, 3, 2);
      shield_nosetop.setTextureSize(128, 64);
      shield_nosetop.mirror = true;
      setRotation(shield_nosetop, 0.2617994F, 0F, 0F);
      PixelmonModelRenderer shield_nosetop2 = new PixelmonModelRenderer(this, 91, 46);
      shield_nosetop2.addBox(-1.5F, -1.933333F, -8.7F, 3, 5, 2);
      shield_nosetop2.setTextureSize(128, 64);
      shield_nosetop2.mirror = true;
      setRotation(shield_nosetop2, -0.2268928F, 0F, 0F);
      PixelmonModelRenderer shield_nose_top_L = new PixelmonModelRenderer(this, 105, 23);
      shield_nose_top_L.addBox(0.8333333F, -1.866667F, -7.9F, 2, 3, 4);
      shield_nose_top_L.setTextureSize(128, 64);
      shield_nose_top_L.mirror = true;
      setRotation(shield_nose_top_L, -0.1570796F, 0F, -0.3665191F);
      PixelmonModelRenderer shield_nose_top_R = new PixelmonModelRenderer(this, 100, 23);
      shield_nose_top_R.addBox(-2.8F, -1.866667F, -7.9F, 2, 3, 4);
      shield_nose_top_R.setTextureSize(128, 64);
      shield_nose_top_R.mirror = true;
      setRotation(shield_nose_top_R, -0.1570796F, 0F, 0.3665191F);
      PixelmonModelRenderer shield_nose_spike_1_L = new PixelmonModelRenderer(this, 33, 0);
      shield_nose_spike_1_L.addBox(1.5F, -1.933333F, -8.7F, 7, 1, 2);
      shield_nose_spike_1_L.setTextureSize(128, 64);
      shield_nose_spike_1_L.mirror = true;
      setRotation(shield_nose_spike_1_L, 0F, 0F, 0F);
      PixelmonModelRenderer shield_nose_spike_2_L = new PixelmonModelRenderer(this, 33, 0);
      shield_nose_spike_2_L.addBox(1.5F, -1.066667F, -8.7F, 7, 1, 2);
      shield_nose_spike_2_L.setTextureSize(128, 64);
      shield_nose_spike_2_L.mirror = true;
      setRotation(shield_nose_spike_2_L, 0F, 0F, -0.1047198F);
      PixelmonModelRenderer shield_nose_spike_1_R = new PixelmonModelRenderer(this, 33, 0);
      shield_nose_spike_1_R.addBox(-8.5F, -1.933333F, -8.7F, 7, 1, 2);
      shield_nose_spike_1_R.setTextureSize(128, 64);
      shield_nose_spike_1_R.mirror = true;
      setRotation(shield_nose_spike_1_R, 0F, 0F, 0F);
      PixelmonModelRenderer shield_nose_spike_2_R = new PixelmonModelRenderer(this, 33, 0);
      shield_nose_spike_2_R.addBox(-8.5F, -1.066667F, -8.7F, 7, 1, 2);
      shield_nose_spike_2_R.setTextureSize(128, 64);
      shield_nose_spike_2_R.mirror = true;
      setRotation(shield_nose_spike_2_R, 0F, 0F, 0.1047198F);
      PixelmonModelRenderer shield_bottom_spike__2_R = new PixelmonModelRenderer(this, 107, 21);
      shield_bottom_spike__2_R.addBox(-6.5F, 0.4F, -5.533333F, 2, 3, 2);
      shield_bottom_spike__2_R.setTextureSize(128, 64);
      shield_bottom_spike__2_R.mirror = true;
      setRotation(shield_bottom_spike__2_R, -0.122173F, 0F, -0.8028515F);
      PixelmonModelRenderer shield_bottom_spike__3_L = new PixelmonModelRenderer(this, 100, 22);
      shield_bottom_spike__3_L.addBox(4.5F, 0.4F, -5.533333F, 2, 3, 2);
      shield_bottom_spike__3_L.setTextureSize(128, 64);
      shield_bottom_spike__3_L.mirror = true;
      setRotation(shield_bottom_spike__3_L, -0.122173F, 0F, 0.8028515F);
      PixelmonModelRenderer shield_bottom_spike__1_R = new PixelmonModelRenderer(this, 100, 22);
      shield_bottom_spike__1_R.addBox(-8.5F, -1.6F, -5.533333F, 3, 3, 3);
      shield_bottom_spike__1_R.setTextureSize(128, 64);
      shield_bottom_spike__1_R.mirror = true;
      setRotation(shield_bottom_spike__1_R, -0.122173F, 0F, -0.9075712F);
      PixelmonModelRenderer shield_bottom_spike__1_L = new PixelmonModelRenderer(this, 100, 22);
      shield_bottom_spike__1_L.addBox(5.5F, -1.6F, -5.533333F, 3, 3, 3);
      shield_bottom_spike__1_L.setTextureSize(128, 64);
      shield_bottom_spike__1_L.mirror = true;
      setRotation(shield_bottom_spike__1_L, -0.122173F, 0F, 0.9075712F);
      PixelmonModelRenderer tooth_1_L = new PixelmonModelRenderer(this, 33, 0);
      tooth_1_L.addBox(2F, -3.6F, -9F, 2, 5, 1);
      tooth_1_L.setTextureSize(128, 64);
      tooth_1_L.mirror = true;
      setRotation(tooth_1_L, 0.3141593F, -0.3141593F, 0F);
      PixelmonModelRenderer tooth_1_R = new PixelmonModelRenderer(this, 33, 0);
      tooth_1_R.addBox(-4F, -3.6F, -9F, 2, 5, 1);
      tooth_1_R.setTextureSize(128, 64);
      tooth_1_R.mirror = true;
      setRotation(tooth_1_R, 0.3141593F, 0.3141593F, 0F);
      PixelmonModelRenderer tooth_2_R = new PixelmonModelRenderer(this, 33, 0);
      tooth_2_R.addBox(-0.5F, -2.6F, -9F, 1, 5, 1);
      tooth_2_R.setTextureSize(128, 64);
      tooth_2_R.mirror = true;
      setRotation(tooth_2_R, 0.2617994F, 0.2443461F, 0F);
      PixelmonModelRenderer tooth_2_L = new PixelmonModelRenderer(this, 33, 0);
      tooth_2_L.addBox(-0.5F, -2.6F, -9F, 1, 5, 1);
      tooth_2_L.setTextureSize(128, 64);
      tooth_2_L.mirror = true;
      setRotation(tooth_2_L, 0.2617994F, -0.2443461F, 0F);
      PixelmonModelRenderer shield_top_spike_1_L = new PixelmonModelRenderer(this, 33, 0);
      shield_top_spike_1_L.addBox(1F, -15.73333F, -6.266667F, 3, 2, 3);
      shield_top_spike_1_L.setTextureSize(128, 64);
      shield_top_spike_1_L.mirror = true;
      setRotation(shield_top_spike_1_L, 0.0523599F, 0F, 0.2094395F);
      PixelmonModelRenderer shield_top_spike_1_R = new PixelmonModelRenderer(this, 33, 0);
      shield_top_spike_1_R.addBox(-4F, -15.73333F, -6.266667F, 3, 2, 3);
      shield_top_spike_1_R.setTextureSize(128, 64);
      shield_top_spike_1_R.mirror = true;
      setRotation(shield_top_spike_1_R, 0.0523599F, 0F, -0.2094395F);
      PixelmonModelRenderer shield_top_spike_2_L = new PixelmonModelRenderer(this, 33, 0);
      shield_top_spike_2_L.addBox(1.5F, -16.46667F, -5.466667F, 2, 2, 2);
      shield_top_spike_2_L.setTextureSize(128, 64);
      shield_top_spike_2_L.mirror = true;
      setRotation(shield_top_spike_2_L, 0.0523599F, 0F, 0.2094395F);
      PixelmonModelRenderer shield_top_spike_2_R = new PixelmonModelRenderer(this, 33, 0);
      shield_top_spike_2_R.addBox(-3.5F, -16.46667F, -5.466667F, 2, 2, 2);
      shield_top_spike_2_R.setTextureSize(128, 64);
      shield_top_spike_2_R.mirror = true;
      setRotation(shield_top_spike_2_R, 0.0523599F, 0F, -0.2094395F);
      PixelmonModelRenderer head_top = new PixelmonModelRenderer(this, 70, 31);
      head_top.addBox(-4.5F, -10.4F, -2.133333F, 9, 8, 4);
      head_top.setTextureSize(128, 64);
      head_top.mirror = true;
      setRotation(head_top, 0.4886922F, 0F, 0F);
      
      PixelmonModelRenderer FLLeg = new PixelmonModelRenderer(this, "Front Left Leg");
      FLLeg.setRotationPoint(6, 6, -5);
      PixelmonModelRenderer front_leg_1_L = new PixelmonModelRenderer(this, 0, 13);
      front_leg_1_L.addBox(-3F, -1.466667F, -1.466667F, 4, 6, 4);
      front_leg_1_L.setTextureSize(128, 64);
      front_leg_1_L.mirror = true;
      setRotation(front_leg_1_L, 0.0872665F, 0.3316126F, -0.6457718F);
      PixelmonModelRenderer front_leg_2_L = new PixelmonModelRenderer(this, 17, 14);
      front_leg_2_L.addBox(0.1333333F, 3F, -0.8F, 4, 4, 5);
      front_leg_2_L.setTextureSize(128, 64);
      front_leg_2_L.mirror = true;
      setRotation(front_leg_2_L, 0F, 0.6806784F, 0F);
      PixelmonModelRenderer front_leg_2_L_2 = new PixelmonModelRenderer(this, 0, 0);
      front_leg_2_L_2.addBox(4.133333F, 0F, -0.8F, 1, 2, 2);
      front_leg_2_L_2.setTextureSize(128, 64);
      front_leg_2_L_2.mirror = true;
      setRotation(front_leg_2_L_2, 0F, 0.3665191F, 0.3316126F);
      PixelmonModelRenderer front_leg_2_L_3 = new PixelmonModelRenderer(this, 0, 0);
      front_leg_2_L_3.addBox(5.066667F, -1.666667F, -0.06666667F, 1, 4, 2);
      front_leg_2_L_3.setTextureSize(128, 64);
      front_leg_2_L_3.mirror = true;
      setRotation(front_leg_2_L_3, 0F, 0.2443461F, 0.3665191F);
      PixelmonModelRenderer front_leg_2_L_4 = new PixelmonModelRenderer(this, 0, 0);
      front_leg_2_L_4.addBox(4.666667F, 0F, -0.8F, 1, 3, 2);
      front_leg_2_L_4.setTextureSize(128, 64);
      front_leg_2_L_4.mirror = true;
      setRotation(front_leg_2_L_4, 0F, -0.2617994F, 0.3316126F);
      PixelmonModelRenderer front_toes_1_L = new PixelmonModelRenderer(this, 33, 0);
      front_toes_1_L.addBox(3.733333F, 5F, -0.1333333F, 1, 2, 4);
      front_toes_1_L.setTextureSize(128, 64);
      front_toes_1_L.mirror = true;
      setRotation(front_toes_1_L, 0F, 0.6806784F, 0F);
      PixelmonModelRenderer front_toes_2_L = new PixelmonModelRenderer(this, 33, 0);
      front_toes_2_L.addBox(4.2F, 4F, 0.8666667F, 1, 3, 2);
      front_toes_2_L.setTextureSize(128, 64);
      front_toes_2_L.mirror = true;
      setRotation(front_toes_2_L, 0F, 0.6806784F, 0F);
      
      
      
      PixelmonModelRenderer FRLeg = new PixelmonModelRenderer(this, "Front Right Leg");
      FRLeg.setRotationPoint(-6, 6, -5);
      PixelmonModelRenderer front_leg_1_R = new PixelmonModelRenderer(this, 0, 13);
      front_leg_1_R.addBox(-1F, -1.466667F, -1.466667F, 4, 6, 4);
      front_leg_1_R.setTextureSize(128, 64);
      front_leg_1_R.mirror = true;
      setRotation(front_leg_1_R, 0.0872665F, -0.3316126F, 0.6457718F);
      PixelmonModelRenderer front_leg_2_R = new PixelmonModelRenderer(this, 17, 14);
      front_leg_2_R.addBox(-4.1F, 3F, -0.8F, 4, 4, 5);
      front_leg_2_R.setTextureSize(128, 64);
      front_leg_2_R.mirror = true;
      setRotation(front_leg_2_R, 0F, -0.6806784F, 0F);
      PixelmonModelRenderer front_leg_2_R_2 = new PixelmonModelRenderer(this, 0, 0);
      front_leg_2_R_2.addBox(-5.1F, 0F, -0.8F, 1, 3, 2);
      front_leg_2_R_2.setTextureSize(128, 64);
      front_leg_2_R_2.mirror = true;
      setRotation(front_leg_2_R_2, 0F, -0.3665191F, -0.3316126F);
      PixelmonModelRenderer front_leg_2_R_3 = new PixelmonModelRenderer(this, 0, 0);
      front_leg_2_R_3.addBox(-6.1F, -1.666667F, -0.06666667F, 1, 4, 2);
      front_leg_2_R_3.setTextureSize(128, 64);
      front_leg_2_R_3.mirror = true;
      setRotation(front_leg_2_R_3, 0F, -0.2443461F, -0.3665191F);
      PixelmonModelRenderer front_leg_2_R_4 = new PixelmonModelRenderer(this, 0, 0);
      front_leg_2_R_4.addBox(-5.7F, 0F, -0.8F, 1, 3, 2);
      front_leg_2_R_4.setTextureSize(128, 64);
      front_leg_2_R_4.mirror = true;
      setRotation(front_leg_2_R_4, 0F, 0.2617994F, -0.3316126F);
      PixelmonModelRenderer front_toes_1_R = new PixelmonModelRenderer(this, 33, 0);
      front_toes_1_R.addBox(-4.7F, 5F, -0.1333333F, 1, 2, 4);
      front_toes_1_R.setTextureSize(128, 64);
      front_toes_1_R.mirror = true;
      setRotation(front_toes_1_R, 0F, -0.6806784F, 0F);
      PixelmonModelRenderer front_toes_2_R = new PixelmonModelRenderer(this, 33, 0);
      front_toes_2_R.addBox(-5.2F, 4F, 0.8666667F, 1, 3, 2);
      front_toes_2_R.setTextureSize(128, 64);
      front_toes_2_R.mirror = true;
      setRotation(front_toes_2_R, 0F, -0.6806784F, 0F);
      
      
      PixelmonModelRenderer BRLeg = new PixelmonModelRenderer(this, "Back Right Leg");
      BRLeg.setRotationPoint(-6, 6, 4.8F);
      PixelmonModelRenderer back_leg_1_R = new PixelmonModelRenderer(this, 0, 13);
      back_leg_1_R.addBox(-1F, -1.466667F, -1.466667F, 4, 6, 4);
      back_leg_1_R.setTextureSize(128, 64);
      back_leg_1_R.mirror = true;
      setRotation(back_leg_1_R, 0.0872665F, -0.122173F, 0.6457718F);
      PixelmonModelRenderer back_leg_2_R = new PixelmonModelRenderer(this, 17, 14);
      back_leg_2_R.addBox(-3.9F, 3F, -0.8F, 5, 4, 5);
      back_leg_2_R.setTextureSize(128, 64);
      back_leg_2_R.mirror = true;
      setRotation(back_leg_2_R, 0F, -0.6806784F, 0F);
      PixelmonModelRenderer back_leg_2_R_2 = new PixelmonModelRenderer(this, 0, 0);
      back_leg_2_R_2.addBox(-5.1F, 0F, -0.8F, 1, 3, 2);
      back_leg_2_R_2.setTextureSize(128, 64);
      back_leg_2_R_2.mirror = true;
      setRotation(back_leg_2_R_2, 0F, -0.3665191F, -0.3316126F);
      PixelmonModelRenderer back_leg_2_R_3 = new PixelmonModelRenderer(this, 0, 0);
      back_leg_2_R_3.addBox(-6.1F, -1.666667F, -0.06666667F, 1, 4, 2);
      back_leg_2_R_3.setTextureSize(128, 64);
      back_leg_2_R_3.mirror = true;
      setRotation(back_leg_2_R_3, 0F, -0.2443461F, -0.3665191F);
      PixelmonModelRenderer back_leg_2_R_4 = new PixelmonModelRenderer(this, 0, 0);
      back_leg_2_R_4.addBox(-5.7F, 0F, -0.8F, 1, 3, 2);
      back_leg_2_R_4.setTextureSize(128, 64);
      back_leg_2_R_4.mirror = true;
      setRotation(back_leg_2_R_4, 0F, 0.2617994F, -0.3316126F);
      PixelmonModelRenderer back_toes_1_R = new PixelmonModelRenderer(this, 33, 0);
      back_toes_1_R.addBox(-4.7F, 5F, -0.1333333F, 1, 2, 4);
      back_toes_1_R.setTextureSize(128, 64);
      back_toes_1_R.mirror = true;
      setRotation(back_toes_1_R, 0F, -0.6806784F, 0F);
      PixelmonModelRenderer back_toes_2_R = new PixelmonModelRenderer(this, 33, 0);
      back_toes_2_R.addBox(-5.2F, 4F, 0.8666667F, 1, 3, 2);
      back_toes_2_R.setTextureSize(128, 64);
      back_toes_2_R.mirror = true;
      setRotation(back_toes_2_R, 0F, -0.6806784F, 0F);
      
      
      PixelmonModelRenderer BLLeg = new PixelmonModelRenderer(this, "Back Left Leg");
      BLLeg.setRotationPoint(6, 6, 4.8F);
      PixelmonModelRenderer  back_leg_1_L = new PixelmonModelRenderer(this, 0, 13);
      back_leg_1_L.addBox(-3F, -1.466667F, -1.466667F, 4, 6, 4);
      back_leg_1_L.setTextureSize(128, 64);
      back_leg_1_L.mirror = true;
      setRotation(back_leg_1_L, 0.0872665F, 0.122173F, -0.6457718F);
      PixelmonModelRenderer  back_leg_2_L = new PixelmonModelRenderer(this, 17, 14);
      back_leg_2_L.addBox(-0.9F, 3F, -0.8F, 5, 4, 5);
      back_leg_2_L.setTextureSize(128, 64);
      back_leg_2_L.mirror = true;
      setRotation(back_leg_2_L, 0F, 0.6806784F, 0F);
      PixelmonModelRenderer  back_leg_2_L_2 = new PixelmonModelRenderer(this, 0, 0);
      back_leg_2_L_2.addBox(4.133333F, 0F, -0.8F, 1, 3, 2);
      back_leg_2_L_2.setTextureSize(128, 64);
      back_leg_2_L_2.mirror = true;
      setRotation(back_leg_2_L_2, 0F, 0.3665191F, 0.3316126F);
      PixelmonModelRenderer  back_leg_2_L_3 = new PixelmonModelRenderer(this, 0, 0);
      back_leg_2_L_3.addBox(5.066667F, -1.666667F, -0.06666667F, 1, 4, 2);
      back_leg_2_L_3.setTextureSize(128, 64);
      back_leg_2_L_3.mirror = true;
      setRotation(back_leg_2_L_3, 0F, 0.2443461F, 0.3665191F);
      PixelmonModelRenderer  back_leg_2_L_4 = new PixelmonModelRenderer(this, 0, 0);
      back_leg_2_L_4.addBox(4.666667F, 0F, -0.8F, 1, 3, 2);
      back_leg_2_L_4.setTextureSize(128, 64);
      back_leg_2_L_4.mirror = true;
      setRotation(back_leg_2_L_4, 0F, -0.2617994F, 0.3316126F);
      PixelmonModelRenderer  back_toes_1_L = new PixelmonModelRenderer(this, 33, 0);
      back_toes_1_L.addBox(3.733333F, 5F, -0.1333333F, 1, 2, 4);
      back_toes_1_L.setTextureSize(128, 64);
      back_toes_1_L.mirror = true;
      setRotation(back_toes_1_L, 0F, 0.6806784F, 0F);
      PixelmonModelRenderer  back_toes_2_L = new PixelmonModelRenderer(this, 33, 0);
      back_toes_2_L.addBox(4.2F, 4F, 0.8666667F, 1, 3, 2);
      back_toes_2_L.setTextureSize(128, 64);
      back_toes_2_L.mirror = true;
      setRotation(back_toes_2_L, 0F, 0.6806784F, 0F);
      
      
      Body.addChild(body_1);
      Body.addChild(body_2);
      Body.addChild(back_spike_1);
      Body.addChild(back_spike_2);
      Body.addChild(back_spike_3);
      Body.addChild(back_spike_4);
      Body.addChild(back_spike_5);
      Body.addChild(back_spike_6);
      Tail.addChild(tail_1);
      Tail.addChild(tail_2);
      Tail.addChild(tail_3);
      Tail.addChild(tail_4);
      Head.addChild(head_main);
      Head.addChild(shield_main);
      Head.addChild(shield_top_L);
      Head.addChild(shield_top_L_2);
      Head.addChild(shield_top_R_2);
      Head.addChild(shield_top_R);
      Head.addChild(shield_top_2_L);
      Head.addChild(shield_top_2_R);
      Head.addChild(shield_top_2_middle);
      Head.addChild(jaw);
      Head.addChild(shield_nose);
      Head.addChild(shield_nose_bottom_L);
      Head.addChild(shield_nose_bottom_R);
      Head.addChild(shield_nose_bottom_middle);
      Head.addChild(shield_nosetop);
      Head.addChild(shield_nosetop2);
      Head.addChild(shield_nose_top_L);
      Head.addChild(shield_nose_top_R);
      Head.addChild(shield_nose_spike_1_L);
      Head.addChild(shield_nose_spike_2_L);
      Head.addChild(shield_nose_spike_1_R);
      Head.addChild(shield_nose_spike_2_R);
      Head.addChild(shield_bottom_spike__2_R);
      Head.addChild(shield_bottom_spike__3_L);
      Head.addChild(shield_bottom_spike__1_R);
      Head.addChild(shield_bottom_spike__1_L);
      Head.addChild(tooth_1_L);
      Head.addChild(tooth_1_R);
      Head.addChild(tooth_2_R);
      Head.addChild(tooth_2_L);
      Head.addChild(shield_top_spike_1_L);
      Head.addChild(shield_top_spike_1_R);
      Head.addChild(shield_top_spike_2_L);
      Head.addChild(shield_top_spike_2_R);
      Head.addChild(head_top);
      FLLeg.addChild(front_leg_1_L);
      FLLeg.addChild(front_leg_2_L);
	  FLLeg.addChild(front_leg_2_L_2);
	  FLLeg.addChild(front_leg_2_L_3);
	  FLLeg.addChild(front_leg_2_L_4);
	  FLLeg.addChild(front_toes_1_L);
	  FLLeg.addChild(front_toes_2_L);
	  FRLeg.addChild(front_leg_1_R);
 	  FRLeg.addChild(front_leg_2_R);
 	  FRLeg.addChild(front_leg_2_R_2);
	  FRLeg.addChild(front_leg_2_R_3);
	  FRLeg.addChild(front_leg_2_R_4);
	  FRLeg.addChild(front_toes_1_R);
	  FRLeg.addChild(front_toes_2_R);
      BRLeg.addChild(back_leg_1_R);
      BRLeg.addChild(back_leg_2_R);
      BRLeg.addChild(back_leg_2_R_2);
      BRLeg.addChild(back_leg_2_R_3);
      BRLeg.addChild(back_leg_2_R_4);
      BRLeg.addChild(back_toes_1_R);
      BRLeg.addChild(back_toes_2_R);
      BLLeg.addChild(back_leg_1_L);
      BLLeg.addChild(back_leg_2_L);
      BLLeg.addChild(back_leg_2_L_2);
      BLLeg.addChild(back_leg_2_L_3);
      BLLeg.addChild(back_leg_2_L_4);
      BLLeg.addChild(back_toes_1_L);
      BLLeg.addChild(back_toes_2_L);
      Body.addChild(Head);
      Body.addChild(Tail);
      Body.addChild(FLLeg);
      Body.addChild(FRLeg);
      Body.addChild(BRLeg);
      Body.addChild(BLLeg);
      
      
      float legspeed = 0.8F;
		float legRotationLimit = 1.1F;
      ModuleLeg frontlegLModule = new ModuleLeg(FLLeg, EnumLeg.FrontLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg frontlegRModule = new ModuleLeg(FRLeg, EnumLeg.FrontRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegLModule = new ModuleLeg(BLLeg, EnumLeg.BackLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegRModule = new ModuleLeg(BRLeg, EnumLeg.BackRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
      
      
      
      ModuleHead headModule = new ModuleHead(Head);
		skeleton = new SkeletonQuadruped(Body, headModule, frontlegLModule, frontlegRModule, backlegLModule, backlegRModule, null);
	
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}