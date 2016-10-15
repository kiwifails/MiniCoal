package kiwifails.minicoal;

import kiwifails.minicoal.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import kiwifails.minicoal.proxy.CommonProxy;

@Mod(modid = MiniCoal.MODID, version = MiniCoal.VERSION, name = MiniCoal.NAME)
public class MiniCoal {
    public static final String MODID = "minicoal";
    public static final String VERSION = "1.0";
    public static final String NAME = "MiniCoal";

    @SidedProxy(clientSide = "kiwifails.minicoal.proxy.ClientProxy", serverSide = "kiwifails.minicoal.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MiniCoal instance;

    public static CreativeTab tabMiniCoal;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
        System.out.println(NAME + " is loading!");
        tabMiniCoal = new CreativeTab(CreativeTabs.getNextID(), "mini_coal");
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }
}