package tcintegrations.data.tcon.material;

import net.minecraft.data.DataGenerator;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

public class MaterialRenderInfoProvider extends AbstractMaterialRenderInfoProvider {

    public MaterialRenderInfoProvider(DataGenerator gen, AbstractMaterialSpriteProvider spriteProvider) {
        super(gen, spriteProvider);
    }

    @Override
    public String getName() {
        return "TCIntegrations - TCon Material Render Info Provider";
    }

    @Override
    protected void addMaterialRenderInfo() {
        buildRenderInfo(MaterialIds.livingWood).color(0x5E2409).fallbacks("wood", "stick", "primitive");
        buildRenderInfo(MaterialIds.livingRock).color(0xDFE2D4).fallbacks("rock");
        buildRenderInfo(MaterialIds.manaSteel).color(0x3389FF).fallbacks("metal");
        buildRenderInfo(MaterialIds.neptunium).color(0x1AF5B9).fallbacks("metal");
        buildRenderInfo(MaterialIds.soulStainedSteel).color(0xA96EC7).fallbacks("metal");
        buildRenderInfo(MaterialIds.desh).color(0x9E3543).fallbacks("metal");
        buildRenderInfo(MaterialIds.calorite).color(0xB42A43).fallbacks("metal");
        buildRenderInfo(MaterialIds.ostrum).color(0x654A59).fallbacks("metal");
        buildRenderInfo(MaterialIds.pendoriteAlloy).color(0x6757AD).fallbacks("metal");
    }

}
