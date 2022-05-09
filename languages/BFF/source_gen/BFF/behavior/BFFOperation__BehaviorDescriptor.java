package BFF.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;

public final class BFFOperation__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x41009928b4904ac3L, 0xb8488158d6c0d5dbL, 0x45ab0ea3d0ad5e6bL, "BFF.structure.BFFOperation");

  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("52_Geb4QDV$").build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getScope_id52_Geb4QDV$);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    return new ListScope(SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(__thisNode__, LINKS.entityTypeRef$8qts), LINKS.entityType$EWiv), LINKS.keyValuePairs$i5YT)) {

      @Override
      public String getName(SNode child) {
        return SPropertyOperations.getString(SNodeOperations.cast(child, CONCEPTS.KeyValuePair$D5), PROPS.key$hZTW);
      }
    };
  }

  /*package*/ BFFOperation__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink entityTypeRef$8qts = MetaAdapterFactory.getContainmentLink(0x41009928b4904ac3L, 0xb8488158d6c0d5dbL, 0x45ab0ea3d0ad5e6bL, 0x45ab0ea3d0ada300L, "entityTypeRef");
    /*package*/ static final SReferenceLink entityType$EWiv = MetaAdapterFactory.getReferenceLink(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x624f1b6582e0e556L, 0x624f1b6582e0e55aL, "entityType");
    /*package*/ static final SContainmentLink keyValuePairs$i5YT = MetaAdapterFactory.getContainmentLink(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x1957db2831e8dd89L, 0x1957db2831e8dd92L, "keyValuePairs");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept KeyValuePair$D5 = MetaAdapterFactory.getConcept(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x1957db2831e8dd8cL, "Microservice.structure.KeyValuePair");
  }

  private static final class PROPS {
    /*package*/ static final SProperty key$hZTW = MetaAdapterFactory.getProperty(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x1957db2831e8dd8cL, 0x1957db2831e8dd8dL, "key");
  }
}
