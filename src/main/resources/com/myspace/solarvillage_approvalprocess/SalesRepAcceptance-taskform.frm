{"id":"b65d0d84-7217-4013-9941-a7547b641d26","name":"SalesRepAcceptance-taskform.frm","model":{"taskName":"SalesRepAcceptance","processId":"com.myspace.solarvillage_approvalprocess.SolarNewOrderPermit-Process","properties":[{"name":"solarNewOrder","typeInfo":{"type":"OBJECT","className":"com.myspace.solarvillage_approvalprocess.SolarNewOrder","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":true}]}},{"name":"salesRepAccepted","typeInfo":{"type":"BASE","className":"java.lang.Boolean","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"3d721b1a-d1c3-4afb-a2c8-70d0cad83477","container":"FIELD_SET","id":"field_36923977897328E10","name":"application","label":"Application","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"","standaloneClassName":"com.myspace.solarvillage_approvalprocess.Application","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"id":"field_825866792094425E11","name":"salesRepAccept","label":"SalesRepAccept","required":true,"readOnly":false,"validateOnChange":true,"helpMessage":"","standaloneClassName":"java.lang.Boolean","code":"CheckBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.checkBox.definition.CheckBoxFieldDefinition"},{"nestedForm":"46bf8166-b394-4b46-9be4-3e78ef3319bf","container":"FIELD_SET","id":"field_710873514527013E11","name":"solarNewOrder","label":"SolarNewOrder","required":false,"readOnly":true,"validateOnChange":true,"binding":"solarNewOrder","standaloneClassName":"com.myspace.solarvillage_approvalprocess.SolarNewOrder","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"id":"field_376011747346721E10","name":"salesRepAccepted","label":"SalesRepAccepted","required":false,"readOnly":false,"validateOnChange":true,"binding":"salesRepAccepted","standaloneClassName":"java.lang.Boolean","code":"CheckBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.checkBox.definition.CheckBoxFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch2 style\u003d\"text-align: center;\"\u003e\u003cu\u003e\u003cb\u003eApplicant Details for Solar Power Home\u003c/b\u003e\u003c/u\u003e\u003c/h2\u003e"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_36923977897328E10","form_id":"b65d0d84-7217-4013-9941-a7547b641d26"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch2 style\u003d\"text-align: center;\"\u003e\u003cb\u003e\u003cu\u003eSales Rep Acceptance\u003c/u\u003e\u003c/b\u003e\u003c/h2\u003e"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_825866792094425E11","form_id":"b65d0d84-7217-4013-9941-a7547b641d26"}}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_710873514527013E11","form_id":"b65d0d84-7217-4013-9941-a7547b641d26"}}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_376011747346721E10","form_id":"b65d0d84-7217-4013-9941-a7547b641d26"}}]}]}]}}