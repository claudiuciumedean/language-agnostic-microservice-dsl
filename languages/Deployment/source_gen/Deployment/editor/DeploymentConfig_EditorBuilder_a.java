package Deployment.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.openapi.editor.menus.transformation.SPropertyInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.core.behavior.PropertyAttribute__BehaviorDescriptor;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.lang.editor.cellProviders.SReferenceCellProvider;
import jetbrains.mps.util.Computable;
import jetbrains.mps.editor.runtime.impl.CellUtil;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.SReferenceSubstituteInfoSmartReferenceDecorator;
import jetbrains.mps.nodeEditor.cellMenu.SReferenceSubstituteInfo;
import jetbrains.mps.lang.core.behavior.LinkAttribute__BehaviorDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;

/*package*/ class DeploymentConfig_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public DeploymentConfig_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_6irgo2_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createConstant_1());
    editorCell.addEditorCell(createConstant_2());
    editorCell.addEditorCell(createProperty_0());
    editorCell.addEditorCell(createConstant_3());
    editorCell.addEditorCell(createRefCell_0());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Deployment configuration");
    editorCell.setCellId("Constant_6irgo2_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_6irgo2_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_2() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "maintainer");
    editorCell.setCellId("Constant_6irgo2_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_0() {
    getCellFactory().pushCellContext();
    try {
      final SProperty property = PROPS.maintainer$57CV;
      getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
      editorCell.setDefaultText("<no maintainer>");
      editorCell.setCellId("property_maintainer");
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      setCellContext(editorCell);
      Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
      Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property);
        }
      });
      if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    } finally {
      getCellFactory().popCellContext();
    }
  }
  private EditorCell createConstant_3() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "microservice");
    editorCell.setCellId("Constant_6irgo2_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefCell_0() {
    CellProviderWithRole provider = new RefCellCellProvider(myNode, LINKS.microservice$Ai5f, CONCEPTS.MicroserviceReference$uK, "microservice", getEditorContext()) {

      @Override
      protected EditorCell createRefCell(EditorContext context, SNode effectiveNode, SNode node) {
        EditorCell cell = new Inline_Builder0(getEditorContext(), myNode, effectiveNode).createCell();
        installDeleteActions_notnull(cell);
        return cell;
      }
    };
    provider.setNoTargetText("<no microservice>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    if (editorCell.getSRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setSRole(LINKS.microservice$Ai5f);
    }
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  /*package*/ static class Inline_Builder0 extends AbstractEditorBuilder {
    @NotNull
    private SNode myNode;
    private SNode myReferencingNode;

    /*package*/ Inline_Builder0(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
      super(context);
      myReferencingNode = referencingNode;
      myNode = node;
    }

    /*package*/ EditorCell createCell() {
      return createCollection_1();
    }

    @NotNull
    @Override
    public SNode getNode() {
      return myNode;
    }

    private EditorCell createCollection_1() {
      EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
      editorCell.setCellId("Collection_6irgo2_a0f0");
      editorCell.addEditorCell(createRefCell_1());
      return editorCell;
    }
    private EditorCell createRefCell_1() {
      final SReferenceLink referenceLink = LINKS.microservice$ZUJs;
      SReferenceCellProvider provider = new SReferenceCellProvider(getNode(), referenceLink, getEditorContext()) {
        protected EditorCell createReferenceCell(final SNode targetNode) {
          EditorCell cell = getUpdateSession().updateReferencedNodeCell(new Computable<EditorCell>() {
            public EditorCell compute() {
              return new Inline_Builder1(getEditorContext(), getNode(), targetNode).createCell();
            }
          }, targetNode, LINKS.microservice$ZUJs);
          CellUtil.setupIDeprecatableStyles(targetNode, cell);
          setSemanticNodeToCells(cell, getNode());
          installDeleteActions_notnull_smartReference(cell);
          return cell;
        }
        @Override
        protected EditorCell createErrorCell(String error) {
          EditorCell_Error cell = new EditorCell_Error(getEditorContext(), getNode(), error, true);
          cell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(getNode(), CellAction_DeleteNode.DeleteDirection.FORWARD));
          cell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(getNode(), CellAction_DeleteNode.DeleteDirection.BACKWARD));
          return cell;
        }
      };

      provider.setNoTargetText("<no microservice>");
      EditorCell editorCell = provider.createCell();

      if (editorCell.getSRole() == null) {
        editorCell.setReferenceCell(true);
        editorCell.setSRole(LINKS.microservice$ZUJs);
      }
      editorCell.setSubstituteInfo(new SReferenceSubstituteInfoSmartReferenceDecorator(new SReferenceSubstituteInfo(editorCell, referenceLink)));
      Iterable<SNode> referenceAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.LinkAttribute$v_);
      Iterable<SNode> currentReferenceAttributes = Sequence.fromIterable(referenceAttributes).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Objects.equals(LinkAttribute__BehaviorDescriptor.getLink_id1avfQ4BEFo6.invoke(it), referenceLink);
        }
      });
      if (Sequence.fromIterable(currentReferenceAttributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentReferenceAttributes).first(), AttributeKind.REFERENCE, editorCell);
      } else
      return editorCell;
    }
    /*package*/ static class Inline_Builder1 extends AbstractEditorBuilder {
      @NotNull
      private SNode myNode;
      private SNode myReferencingNode;

      /*package*/ Inline_Builder1(@NotNull EditorContext context, SNode referencingNode, @NotNull SNode node) {
        super(context);
        myReferencingNode = referencingNode;
        myNode = node;
      }

      /*package*/ EditorCell createCell() {
        return createProperty_1();
      }

      @NotNull
      @Override
      public SNode getNode() {
        return myNode;
      }

      private EditorCell createProperty_1() {
        getCellFactory().pushCellContext();
        try {
          final SProperty property = PROPS.name$MnvL;
          getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
          EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, true, false), myNode);
          editorCell.setDefaultText("<no name>");
          editorCell.setCellId("property_name");
          Style style = new StyleImpl();
          style.set(StyleAttributes.AUTO_DELETABLE, true);
          editorCell.getStyle().putAll(style);
          editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
          setCellContext(editorCell);
          Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
          Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where(new IWhereFilter<SNode>() {
            public boolean accept(SNode it) {
              return Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property);
            }
          });
          if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
            EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
            return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
          } else
          return editorCell;
        } finally {
          getCellFactory().popCellContext();
        }
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty maintainer$57CV = MetaAdapterFactory.getProperty(0xc2a6432be821404bL, 0xaf0e22b30531f868L, 0x76dbdb74d850dc4L, 0x76dbdb74d850dc7L, "maintainer");
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept PropertyAttribute$Gb = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute");
    /*package*/ static final SConcept MicroserviceReference$uK = MetaAdapterFactory.getConcept(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x675907eeb91f484bL, "Microservice.structure.MicroserviceReference");
    /*package*/ static final SConcept LinkAttribute$v_ = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da51L, "jetbrains.mps.lang.core.structure.LinkAttribute");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink microservice$Ai5f = MetaAdapterFactory.getContainmentLink(0xc2a6432be821404bL, 0xaf0e22b30531f868L, 0x76dbdb74d850dc4L, 0x675907eeb91f484eL, "microservice");
    /*package*/ static final SReferenceLink microservice$ZUJs = MetaAdapterFactory.getReferenceLink(0xe995fbb60310461aL, 0xbe22cc66f48262f1L, 0x675907eeb91f484bL, 0x675907eeb91f484cL, "microservice");
  }
}
