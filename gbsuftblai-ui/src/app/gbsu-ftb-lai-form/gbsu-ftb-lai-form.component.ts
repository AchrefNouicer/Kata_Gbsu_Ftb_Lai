import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  @Output()
  submitNumberOutput = new EventEmitter<number>();
  inputNumber: string;

  constructor() {
  }

  ngOnInit(): void {
  }

  convertValue(): void {
    this.submitNumberOutput.emit(+this.inputNumber);
  }

  isInputNumberEmpty(): boolean {
    console.log(this.inputNumber);
    return this.inputNumber === undefined || this.inputNumber === null || this.inputNumber === '';
  }
}
