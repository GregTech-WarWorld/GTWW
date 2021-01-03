package mgKze.mod;

import mgKze.mod.proxy.CommonProxy;
import mgKze.mod.tabs.GTWWTab;
import mgKze.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "gtww";
    public static final String NAME = "GregTech:WarWorld";
    public static final String VERSION = "1.0";
    public static final String CLIENT = "mgKze.mod.proxy.ClientProxy";
    public static final String SERVER = "mgKze.mod.proxy.CommonProxy";
    public static final CreativeTabs GTWWTab = new GTWWTab("GregTech:WarWorld");
    public static final int ENTITY_MGKZE = 114;
    
    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Main.CLIENT, serverSide = Main.SERVER)
    public static CommonProxy proxy;
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    	RegistryHandler.preInitRegistries();
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
