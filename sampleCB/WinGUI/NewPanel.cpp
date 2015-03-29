#include "NewPanel.h"

//(*InternalHeaders(NewPanel)
#include <wx/intl.h>
#include <wx/string.h>
//*)

//(*IdInit(NewPanel)
const long NewPanel::ID_CHECKBOX1 = wxNewId();
//*)

BEGIN_EVENT_TABLE(NewPanel,wxPanel)
	//(*EventTable(NewPanel)
	//*)
END_EVENT_TABLE()

NewPanel::NewPanel(wxWindow* parent,wxWindowID id)
{
	//(*Initialize(NewPanel)
	Create(parent, id, wxDefaultPosition, wxSize(52,111), wxTAB_TRAVERSAL, _T("id"));
	CheckBox1 = new wxCheckBox(this, ID_CHECKBOX1, _("Label"), wxPoint(0,24), wxSize(80,32), 0, wxDefaultValidator, _T("ID_CHECKBOX1"));
	CheckBox1->SetValue(false);
	//*)
}

NewPanel::~NewPanel()
{
	//(*Destroy(NewPanel)
	//*)
}

