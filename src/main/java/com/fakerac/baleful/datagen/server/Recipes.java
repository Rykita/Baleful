package com.fakerac.baleful.datagen.server;

import com.fakerac.baleful.init.BlockInit;
import com.fakerac.baleful.util.RegistryHandler;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
       super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(BlockInit.BLOSSOM_PLANKS.get())
                .patternLine("   ")
                .patternLine(" # ")
                .patternLine("   ")
                .key('#', Tags.Items.COBBLESTONE)
                .setGroup("baleful")
                .addCriterion("cobblestone", InventoryChangeTrigger.Instance.forItems(Blocks.COBBLESTONE))
                .build(consumer);

    }
}
