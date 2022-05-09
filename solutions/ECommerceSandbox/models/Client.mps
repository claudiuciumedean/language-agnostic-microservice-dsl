<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:47d68633-331a-455d-9f8a-c5c197b816a4(Client)">
  <persistence version="9" />
  <languages>
    <use id="48e57d50-7e0f-4c8f-93fc-859018228309" name="Client" version="0" />
  </languages>
  <imports>
    <import index="wqkn" ref="r:603c66ef-a9f0-4498-bd77-31806b3ddb70(MobileBFF)" />
    <import index="88nh" ref="r:7b483502-51d8-43fc-8aff-a1caa13cddf9(ItemsService)" />
    <import index="8yoi" ref="r:98e0c885-b521-46cb-9954-4ddf92d15c03(DesktopBFF)" />
  </imports>
  <registry>
    <language id="41009928-b490-4ac3-b848-8158d6c0d5db" name="BFF">
      <concept id="756716148938414810" name="BFF.structure.BFFReference" flags="ng" index="fLJYe">
        <reference id="756716148938414811" name="bff" index="fLJYf" />
      </concept>
    </language>
    <language id="e995fbb6-0310-461a-be22-cc66f48262f1" name="Microservice">
      <concept id="6302204855854083592" name="Microservice.structure.IDeliveredPayloadType" flags="ng" index="1hAkf_">
        <child id="6302204855854083593" name="payloadType" index="1hAkf$" />
      </concept>
      <concept id="6302204855853965573" name="Microservice.structure.Entity" flags="ng" index="1hBKNC" />
      <concept id="7083910861679076352" name="Microservice.structure.KeyValuePairReference" flags="ng" index="3wDFX_">
        <reference id="7083910861679076353" name="keyValuePair" index="3wDFX$" />
      </concept>
      <concept id="7083910861678503254" name="Microservice.structure.EntityTypeReference" flags="ng" index="3wFZSN">
        <reference id="7083910861678503258" name="entityType" index="3wFZSZ" />
      </concept>
      <concept id="4706807959194688950" name="Microservice.structure.CREATE" flags="ng" index="3K_yPg" />
      <concept id="4706807959194688952" name="Microservice.structure.DELETE" flags="ng" index="3K_yPu" />
      <concept id="4706807959194649864" name="Microservice.structure.READ" flags="ng" index="3K_FnI" />
      <concept id="4706807959194929334" name="Microservice.structure.IOperationType" flags="ng" index="3KABxg">
        <child id="4706807959194929335" name="operationType" index="3KABxh" />
      </concept>
    </language>
    <language id="48e57d50-7e0f-4c8f-93fc-859018228309" name="Client">
      <concept id="756716148943048266" name="Client.structure.Link" flags="ng" index="f3iGu">
        <property id="756716148943127649" name="text" index="f3I4P" />
        <child id="756716148943048269" name="page" index="f3iGp" />
        <child id="756716148943048271" name="queryParam" index="f3iGr" />
      </concept>
      <concept id="756716148943844282" name="Client.structure.Image" flags="ng" index="f6hrI">
        <property id="756716148943844292" name="altText" index="f6hqg" />
        <child id="756716148943844283" name="imgSrc" index="f6hrJ" />
      </concept>
      <concept id="756716148944271638" name="Client.structure.Text" flags="ng" index="f7TL2">
        <child id="756716148944271641" name="text" index="f7TLd" />
      </concept>
      <concept id="756716148935626254" name="Client.structure.Client" flags="ng" index="fB6Hq">
        <property id="756716148935626262" name="version" index="fB6H2" />
        <property id="756716148935626257" name="mainteinerEmail" index="fB6H5" />
        <property id="756716148935626259" name="description" index="fB6H7" />
        <child id="756716148936165036" name="pages" index="fD2fS" />
      </concept>
      <concept id="756716148935626276" name="Client.structure.PageReference" flags="ng" index="fB6HK">
        <reference id="756716148935655214" name="page" index="fB1DU" />
      </concept>
      <concept id="756716148936233805" name="Client.structure.ClientReference" flags="ng" index="fDjop">
        <reference id="756716148936233806" name="client" index="fDjoq" />
      </concept>
      <concept id="756716148940434080" name="Client.structure.Card" flags="ng" index="fTgZO">
        <child id="756716148942647302" name="imageSrc" index="f1Pli" />
        <child id="756716148942647304" name="title" index="f1Pls" />
        <child id="756716148942647307" name="description" index="f1Plv" />
        <child id="756716148943052288" name="action" index="f3jHk" />
      </concept>
      <concept id="756716148941240400" name="Client.structure.Title" flags="ng" index="fWtO4">
        <child id="756716148941240401" name="text" index="fWtO5" />
      </concept>
      <concept id="6244455322315768002" name="Client.structure.ClientConfig" flags="ng" index="2wLgf5">
        <child id="756716148936346067" name="mobileClientRef" index="fDQM7" />
      </concept>
      <concept id="8980703707718628070" name="Client.structure.ActionOperationReference" flags="ng" index="37eYMm">
        <reference id="8980703707718628071" name="actionOperation" index="37eYMn" />
      </concept>
      <concept id="8980703707718628039" name="Client.structure.CrudAction" flags="ng" index="37eYMR">
        <property id="8980703707718628040" name="variant" index="37eYMS" />
        <property id="8980703707718628158" name="text" index="37eYPe" />
        <child id="8980703707718628104" name="actionOperationRef" index="37eYPS" />
      </concept>
      <concept id="920569258022129211" name="Client.structure.ActionOperation" flags="ng" index="3jiOFB">
        <property id="920569258022129216" name="route" index="3jiOEs" />
        <child id="8980703707718154456" name="BFFRef" index="37cMqC" />
        <child id="920569258022129214" name="queryParams" index="3jiOFy" />
      </concept>
      <concept id="8033641832267364504" name="Client.structure.Page" flags="ng" index="3uvC8Q">
        <property id="756716148937107762" name="route" index="fGGLA" />
        <property id="756716148940097810" name="bffRoute" index="fS2L6" />
        <child id="756716148938535141" name="bff" index="fM1mL" />
        <child id="756716148940097701" name="entityType" index="fS2RL" />
        <child id="756716148940097702" name="queryParams" index="fS2RM" />
        <child id="756716148940970772" name="components" index="fVvT0" />
        <child id="920569258022133389" name="actions" index="3jiPDh" />
      </concept>
      <concept id="8033641832263665204" name="Client.structure.IClientType" flags="ng" index="3vHBMq">
        <child id="8033641832263665214" name="clientType" index="3vHBMg" />
      </concept>
      <concept id="8033641832263665226" name="Client.structure.Desktop" flags="ng" index="3vHBN$" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2wLgf5" id="E0plg5f5Mo">
    <property role="3GE5qa" value="Client" />
    <property role="TrG5h" value="MyApp" />
    <node concept="fDjop" id="E0plg5kGST" role="fDQM7">
      <ref role="fDjoq" node="E0plg57N7w" resolve="MyMobileClient" />
    </node>
  </node>
  <node concept="fB6Hq" id="E0plg57N7w">
    <property role="fB6H2" value="1.0" />
    <property role="TrG5h" value="MyDesktop" />
    <property role="fB6H5" value="claudiuciumedean@gmail.com" />
    <property role="fB6H7" value="This is the client for desktop" />
    <property role="3GE5qa" value="Client" />
    <node concept="3uvC8Q" id="E0plg5xyeQ" role="fD2fS">
      <property role="TrG5h" value="Items" />
      <property role="fGGLA" value="/" />
      <property role="fS2L6" value="/items" />
      <node concept="3jiOFB" id="7MxRB2VDfwe" role="3jiPDh">
        <property role="TrG5h" value="myOperation" />
        <property role="3jiOEs" value="/items" />
        <node concept="3K_FnI" id="7MxRB2VDfwi" role="3KABxh" />
        <node concept="fLJYe" id="7MxRB2VLRBJ" role="37cMqC">
          <ref role="fLJYf" to="8yoi:5cGqGoaCF3T" resolve="desktop" />
        </node>
        <node concept="3wDFX_" id="7MxRB2VLRBK" role="3jiOFy">
          <ref role="3wDFX$" to="88nh:1GcCT5ob3GT" />
        </node>
      </node>
      <node concept="3wFZSN" id="E0plg5xN03" role="fS2RL">
        <ref role="3wFZSZ" to="88nh:1GcCT5ob3GR" resolve="item" />
      </node>
      <node concept="fLJYe" id="E0plg5y_Hz" role="fM1mL">
        <ref role="fLJYf" to="wqkn:4mF3EfgFMLR" resolve="mobile" />
      </node>
      <node concept="fTgZO" id="7MxRB2V$JqI" role="fVvT0">
        <node concept="3wDFX_" id="7MxRB2V$JqK" role="f1Pli">
          <ref role="3wDFX$" to="88nh:1GcCT5ob3H2" />
        </node>
        <node concept="3wDFX_" id="7MxRB2V$JqM" role="f1Pls">
          <ref role="3wDFX$" to="88nh:1GcCT5ob3GZ" />
        </node>
        <node concept="3wDFX_" id="7MxRB2V$JqO" role="f1Plv">
          <ref role="3wDFX$" to="88nh:5cGqGoaCF3M" />
        </node>
        <node concept="f3iGu" id="7MxRB2V$JqS" role="f3jHk">
          <property role="f3I4P" value="See more" />
          <node concept="3wDFX_" id="7MxRB2V$JqY" role="f3iGr">
            <ref role="3wDFX$" to="88nh:1GcCT5ob3GT" />
          </node>
          <node concept="fB6HK" id="7MxRB2VFu34" role="f3iGp">
            <ref role="fB1DU" node="7MxRB2VFu2w" resolve="Item" />
          </node>
        </node>
      </node>
      <node concept="37eYMR" id="7MxRB2VASmq" role="fVvT0">
        <property role="37eYPe" value="See more here" />
        <property role="37eYMS" value="primary" />
        <node concept="37eYMm" id="7MxRB2VDfwo" role="37eYPS">
          <ref role="37eYMn" node="7MxRB2VDfwe" resolve="myOperation" />
        </node>
      </node>
    </node>
    <node concept="3uvC8Q" id="7MxRB2VFu2w" role="fD2fS">
      <property role="TrG5h" value="Item" />
      <property role="fGGLA" value="/item" />
      <property role="fS2L6" value="/item" />
      <node concept="3jiOFB" id="7MxRB2VFu4f" role="3jiPDh">
        <property role="TrG5h" value="addToCart" />
        <property role="3jiOEs" value="/create-order" />
        <node concept="3K_yPg" id="7MxRB2VFu4l" role="3KABxh" />
        <node concept="1hBKNC" id="7MxRB2VFu4n" role="1hAkf$" />
        <node concept="fLJYe" id="7MxRB2VLRPN" role="37cMqC">
          <ref role="fLJYf" to="8yoi:5cGqGoaCF3T" resolve="desktop" />
        </node>
      </node>
      <node concept="3jiOFB" id="7MxRB2VLRPK" role="3jiPDh">
        <property role="TrG5h" value="deleteItem" />
        <property role="3jiOEs" value="/delete-item" />
        <node concept="fLJYe" id="7MxRB2VLRPM" role="37cMqC">
          <ref role="fLJYf" to="8yoi:5cGqGoaCF3T" resolve="desktop" />
        </node>
        <node concept="3K_yPu" id="7MxRB2VLRPO" role="3KABxh" />
        <node concept="3wDFX_" id="7MxRB2VLRPP" role="3jiOFy">
          <ref role="3wDFX$" to="88nh:1GcCT5ob3GT" />
        </node>
      </node>
      <node concept="3wFZSN" id="7MxRB2VFu2y" role="fS2RL">
        <ref role="3wFZSZ" to="88nh:1GcCT5ob3GR" resolve="item" />
      </node>
      <node concept="3wDFX_" id="7MxRB2VFu2Q" role="fS2RM">
        <ref role="3wDFX$" to="88nh:1GcCT5ob3GT" />
      </node>
      <node concept="fLJYe" id="7MxRB2VFu2S" role="fM1mL">
        <ref role="fLJYf" to="wqkn:4mF3EfgFMLR" resolve="mobile" />
      </node>
      <node concept="f6hrI" id="7MxRB2VFu36" role="fVvT0">
        <property role="f6hqg" value="Item image" />
        <node concept="3wDFX_" id="7MxRB2VFu38" role="f6hrJ">
          <ref role="3wDFX$" to="88nh:1GcCT5ob3H6" />
        </node>
      </node>
      <node concept="fWtO4" id="7MxRB2VFu3q" role="fVvT0">
        <node concept="3wDFX_" id="7MxRB2VLRBL" role="fWtO5">
          <ref role="3wDFX$" to="88nh:1GcCT5ob3GZ" />
        </node>
      </node>
      <node concept="f7TL2" id="7MxRB2VFu3B" role="fVvT0">
        <node concept="3wDFX_" id="7MxRB2VFu3I" role="f7TLd">
          <ref role="3wDFX$" to="88nh:5cGqGoaCF3M" />
        </node>
      </node>
      <node concept="37eYMR" id="7MxRB2VFu46" role="fVvT0">
        <property role="37eYPe" value="Add to cart" />
        <property role="37eYMS" value="primary" />
        <node concept="37eYMm" id="7MxRB2VFu4p" role="37eYPS">
          <ref role="37eYMn" node="7MxRB2VFu4f" resolve="addToCart" />
        </node>
      </node>
      <node concept="37eYMR" id="7MxRB2VLRPI" role="fVvT0">
        <property role="37eYPe" value="Delete" />
        <property role="37eYMS" value="danger" />
        <node concept="37eYMm" id="7MxRB2VLRPQ" role="37eYPS">
          <ref role="37eYMn" node="7MxRB2VLRPK" resolve="deleteItem" />
        </node>
      </node>
    </node>
    <node concept="3vHBN$" id="7MxRB2VLRBI" role="3vHBMg" />
  </node>
</model>

