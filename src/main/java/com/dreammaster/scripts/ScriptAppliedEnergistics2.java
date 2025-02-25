package com.dreammaster.scripts;
import com.dreammaster.gthandler.CustomItemList;
import com.dreammaster.gthandler.GT_CustomLoader;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static gregtech.api.util.GT_ModHandler.getModItem;

public class ScriptAppliedEnergistics2 implements IScriptLoader {

    public ScriptAppliedEnergistics2(){

    }

    @Override
    public void initScriptData(){
        scriptName.setLength(0);
        scriptName.append("AppliedEnergistics2");
        dependencies.clear();
        dependencies.addAll(java.util.Arrays.asList("appliedenergistics2"));
    }

    @Override
    public void loadRecipes() {
        final ItemStack CraftingUnit = getModItem("appliedenergistics2", "tile.BlockCraftingUnit", 1);
        final ItemStack CoCraftingUnit4x = getModItem("appliedenergistics2", "tile.BlockCraftingUnit", 1, 2);
        final ItemStack CoCraftingUnit16x = getModItem("appliedenergistics2", "tile.BlockCraftingUnit", 1, 3);

        GT_Values.RA.addAssemblerRecipe(
                CraftingUnit,
                OrePrefixes.circuit.get(Materials.Elite),
                2,
                GT_Values.NF,
                CoCraftingUnit4x,
                100,
                480
        );

        GT_Values.RA.addAssemblerRecipe(
                CraftingUnit,
                OrePrefixes.circuit.get(Materials.Superconductor),
                2,
                GT_Values.NF,
                CoCraftingUnit16x,
                100,
                30720
        );
    }

}
