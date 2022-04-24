package BFF.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_BFF;
  private ConceptPresentation props_BFFOperation;
  private ConceptPresentation props_Desktop;
  private ConceptPresentation props_ISupportedType;
  private ConceptPresentation props_Mobile;
  private ConceptPresentation props_SupportedType;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.BFF:
        if (props_BFF == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_BFF = cpb.create();
        }
        return props_BFF;
      case LanguageConceptSwitch.BFFOperation:
        if (props_BFFOperation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("BFFOperation");
          props_BFFOperation = cpb.create();
        }
        return props_BFFOperation;
      case LanguageConceptSwitch.Desktop:
        if (props_Desktop == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Desktop");
          props_Desktop = cpb.create();
        }
        return props_Desktop;
      case LanguageConceptSwitch.ISupportedType:
        if (props_ISupportedType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ISupportedType = cpb.create();
        }
        return props_ISupportedType;
      case LanguageConceptSwitch.Mobile:
        if (props_Mobile == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Mobile");
          props_Mobile = cpb.create();
        }
        return props_Mobile;
      case LanguageConceptSwitch.SupportedType:
        if (props_SupportedType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("SupportedType");
          props_SupportedType = cpb.create();
        }
        return props_SupportedType;
    }
    return null;
  }
}
