import mods.gregtech.recipe.RecipeMap;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.FuelRecipe;

val hammer = RecipeMap.getByName("forge_hammer");
val compressor = RecipeMap.getByName("compressor");
val macerator = RecipeMap.getByName("macerator");
val assembler = RecipeMap.getByName("assembler");
val alloy = RecipeMap.getByName("alloy_smelter");
val extractor = RecipeMap.getByName("extractor");
val lathe = RecipeMap.getByName("lathe");
val canner = RecipeMap.getByName("canner");
val fluid_canner = RecipeMap.getByName("fluid_canner");
val fluid_extractor = RecipeMap.getByName("fluid_extractor");
val freezer = RecipeMap.getByName("vacuum_freezer");
val mixer = RecipeMap.getByName("mixer");
val thermal_sep = RecipeMap.getByName("thermal_centrifuge");
val sifter = RecipeMap.getByName("sifter");
val autoclave = RecipeMap.getByName("autoclave");
val reactor = RecipeMap.getByName("chemical_reactor");
val solidifier = RecipeMap.getByName("fluid_solidifier");
val saw = RecipeMap.getByName("cutting_saw");
val forming = RecipeMap.getByName("forming_press");
val electrolyzer = RecipeMap.getByName("electrolyzer");
val circuit_assembler = RecipeMap.getByName("circuit_assembler");
val implosion = RecipeMap.getByName("implosion_compressor");
val engraver = RecipeMap.getByName("laser_engraver");
val attractor = RecipeMap.getByName("attractor");
val packer = RecipeMap.getByName("packer");
val unpacker = RecipeMap.getByName("unpacker");
val arc = RecipeMap.getByName("arc_furnace");
val plasma_arc = RecipeMap.getByName("plasma_arc_furnace");
val bath = RecipeMap.getByName("chemical_bath");
val mill = RecipeMap.getByName("wiremill");
val centrifuge = RecipeMap.getByName("centrifuge");
val semi_fluid = RecipeMap.getByName("semi_fluid_generator");
val polarizer = RecipeMap.getByName("polarizer");
val extruder = RecipeMap.getByName("extruder");

//AppliedEnergetics2
polarizer.recipeBuilder().inputs([<gregtech:meta_item_1:8202>]).outputs([<appliedenergistics2:material:0>]).EUt(30).duration(200).buildAndRegister();
polarizer.recipeBuilder().inputs([<appliedenergistics2:material:0>]).outputs([<appliedenergistics2:material:1>]).EUt(30).duration(200).buildAndRegister();
autoclave.recipeBuilder().inputs([<appliedenergistics2:material:2>]).fluidInputs([<liquid:water>*100]).outputs([<appliedenergistics2:material:0>]).EUt(30).duration(200).buildAndRegister();
autoclave.recipeBuilder().inputs([<appliedenergistics2:material:8>]).fluidInputs([<liquid:water>*100]).outputs([<appliedenergistics2:material:7>]).EUt(30).duration(200).buildAndRegister();
macerator.recipeBuilder().inputs([<appliedenergistics2:material:0>]).outputs([<appliedenergistics2:material:2>]).EUt(30).duration(200).buildAndRegister();
macerator.recipeBuilder().inputs([<appliedenergistics2:material:7>]).outputs([<appliedenergistics2:material:8>]).EUt(30).duration(200).buildAndRegister();
mixer.recipeBuilder().inputs([<appliedenergistics2:material:1>,<minecraft:redstone>,<gregtech:meta_item_1:2201>]).fluidInputs([<liquid:water>*100]).outputs([<appliedenergistics2:material:7>]).EUt(30).duration(200).buildAndRegister();
extruder.recipeBuilder().duration(200).EUt(30).notConsumable(<appliedenergistics2:material:13>).inputs([<appliedenergistics2:material:10>]).outputs([<appliedenergistics2:material:16>]).buildAndRegister();
extruder.recipeBuilder().duration(200).EUt(30).notConsumable(<appliedenergistics2:material:14>).inputs([<minecraft:diamond>]).outputs([<appliedenergistics2:material:17>]).buildAndRegister();
extruder.recipeBuilder().duration(200).EUt(30).notConsumable(<appliedenergistics2:material:15>).inputs([<minecraft:gold_ingot>]).outputs([<appliedenergistics2:material:18>]).buildAndRegister();
extruder.recipeBuilder().duration(200).EUt(30).notConsumable(<appliedenergistics2:material:19>).inputs([<appliedenergistics2:material:5>]).outputs([<appliedenergistics2:material:20>]).buildAndRegister();
assembler.recipeBuilder().duration(200).EUt(30).inputs([<appliedenergistics2:material:18>,<appliedenergistics2:material:20>,<minecraft:redstone>]).outputs([<appliedenergistics2:material:22>]).buildAndRegister();
assembler.recipeBuilder().duration(200).EUt(30).inputs([<appliedenergistics2:material:17>,<appliedenergistics2:material:20>,<minecraft:redstone>]).outputs([<appliedenergistics2:material:24>]).buildAndRegister();
assembler.recipeBuilder().duration(200).EUt(30).inputs([<appliedenergistics2:material:16>,<appliedenergistics2:material:20>,<minecraft:redstone>]).outputs([<appliedenergistics2:material:23>]).buildAndRegister();
polarizer.recipeBuilder().inputs([<appliedenergistics2:crystal_seed:0>]).outputs([<appliedenergistics2:material:10>]).EUt(30).duration(200).buildAndRegister();
polarizer.recipeBuilder().inputs([<appliedenergistics2:crystal_seed:600>]).outputs([<appliedenergistics2:material:11>]).EUt(30).duration(200).buildAndRegister();
polarizer.recipeBuilder().inputs([<appliedenergistics2:crystal_seed:1200>]).outputs([<appliedenergistics2:material:12>]).EUt(30).duration(200).buildAndRegister();

//ModernWarfare grenades and devices
