package com.miquol.timermod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "TimerMod", name = "Timer Mod", version = "1.7.2-0.0.0")
public class TimerMod {
	
	@Mod.Instance("TimerMod")
	public static TimerMod instance;
	
	@Mod.EventHandler
	public void preInit (FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
